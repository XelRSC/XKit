package com.xkit.mapview;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;

import com.ploader.Plugin;
import com.xkit.Config;
import com.xkit.IOHelper;
import com.xkit.components.JSuggestField;

/***
 *@author Xel
 *@version 1.0
 *@project XkitPl
 *@file MapPanel.java
 *@date 9.1.2014
 *@time 7.50.50
 */
public class MapPanel extends JPanel {
	private final JPanel panel;
	private final JScrollPane scrollPane;
	private final JSuggestField textField;
	private final JButton btnLocate;
	private final JButton btnPopout;
	private final Vector<String> Suggestions = new Vector<String>();
	private final Map<String, Point> Coordinates = new HashMap<String, Point>();
	
	public MapPanel(final Plugin plugin) {
		setLayout(new MigLayout("insets 0", "[grow]", "[22.00:19.00][grow]"));
		
		this.panel = new JPanel();
		add(this.panel, "cell 0 0,grow");
		this.panel.setLayout(new MigLayout("insets 2", "[grow][right][right]", "[]"));
		
		final String[][] data = IOHelper.LoadTable("[Locations]", Config.Paths.dataDir + "\\MapView\\Locations.xkd");
		for(int x = 0 ; x < data.length ; x++){
			Suggestions.add(data[x][0]);
			final String[] coord = data[x][1].split(",");
			Coordinates.put(data[x][0], new Point(Integer.parseInt(coord[0]), Integer.parseInt(coord[1])));
		}
		
		this.textField = new JSuggestField(plugin.getTools().frameFinder("orion"), Suggestions);

		this.panel.add(this.textField, "flowx,cell 0 0,grow");
		this.textField.setColumns(10);
		
		this.btnLocate = new JButton("Locate");
		this.panel.add(this.btnLocate, "cell 1 0,growy");
		
		this.btnPopout = new JButton("P");
		this.btnPopout.setMaximumSize(new Dimension(35, 23));
		this.panel.add(this.btnPopout, "cell 2 0,alignx right,growy");
		
		this.scrollPane = new JScrollPane();
		add(this.scrollPane, "cell 0 1,grow");
		
		this.scrollPane.setViewportView(XkitMap.GetXkitMap(new ImageIcon(Config.Paths.mapDir + "WorldMap.jpg")));
		
		init();
	}
	
	private void init(){
		
		
		this.textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(final KeyEvent e) {
				//if(e.getKeyCode() == KeyEvent.VK_ENTER && Suggestions.contains(textField.getText()))
				//	Locate(Coordinates.get(textField.getText()), true);
			}
		});
		
		this.btnLocate.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(final ActionEvent e) {
			//	Locate(Coordinates.get(textField.getText()), true);
			}
			
		});
		
		this.btnPopout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
			//	MapFrame.getMapFrame();
			}
		});
	}

}
