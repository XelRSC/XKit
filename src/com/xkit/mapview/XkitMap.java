package com.xkit.mapview;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.xkit.Config;

/***
 *@author Xel
 *@version 1.1
 *@project XKit
 *@file Map.java
 *@date 24.10.2013
 *@time 18.49.23
 */
public class XkitMap extends JLabel{
	
	private Point Location;
	private static XkitMap xkitMap;
	
	private XkitMap(final ImageIcon icon){
		this.setIcon(icon);
	}
	
	public static XkitMap GetXkitMap(final ImageIcon icon){
		if(xkitMap == null)
			xkitMap = new XkitMap(icon);
		return xkitMap;
	}
	
	public static XkitMap GetXkitMap(){
		return xkitMap;
	}
	
	public void SetMap(final ImageIcon icon){
		this.setIcon(icon);
	}
	
	public void DrawLocation(final Point loc){
		Location = loc;
		this.repaint();
	}
	
	@Override
	public void paintComponent(final Graphics g){
		super.paintComponent(g);
		
		if(Location != null){
			final Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Config.Blue);
			g2d.drawLine(0, Location.y, this.getWidth(), Location.y);
			g2d.drawLine(Location.x, 0, Location.x, this.getHeight());
			final Ellipse2D.Double loc = new Ellipse2D.Double(Location.x - 5, Location.y - 5, 10, 10);
			g2d.draw(loc);
		}
	}

}
