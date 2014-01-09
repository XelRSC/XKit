package com.xkit.gui;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

import com.ploader.Plugin;
import com.xkit.Config;
import com.xkit.mapview.MapPanel;

/***
 *@author Xel
 *@version 1.0
 *@project XkitPl
 *@file XkitGui.java
 *@date 9.1.2014
 *@time 7.46.17
 */
public class XkitGui extends JTabbedPane {
	
	public XkitGui(final Plugin plugin) {
		setBorder(null);
			//	addTab("", new ImageIcon(Config.Paths.guiDir + "TAB_Settings2.png"), new JPanel(), "XKit Settings");
				addTab("", new ImageIcon(Config.Paths.guiDir + "T2.png"), new MapPanel(plugin), "XKit MapView v" + Config.Versions.mapView + " by Xel");
			//	addTab("", new ImageIcon(Config.Paths.guiDir + "TAB_TreasureTrails2.png"), new JPanel(), "XKit Treasure Trails");
			//	addTab("", new ImageIcon(Config.Paths.guiDir + "TAB_Placeholder2.png"), new JPanel(), "Coming soon");
			//	addTab("", new ImageIcon(Config.Paths.guiDir + "TAB_Placeholder2.png"), new JPanel(), "Coming soon");
			//	setEnabledAt(3, false);
			//	setEnabledAt(4, false);
		
		
	}

}
