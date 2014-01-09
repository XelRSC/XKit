package com.xkit;

import java.awt.Color;

/***
 *@author Xel
 *@version 1.0
 *@project XkitPl
 *@file Config.java
 *@date 9.1.2014
 *@time 7.48.29
 */
public class Config {
	
	public static final Color Blue = new Color(30, 144, 255);

	public static class Paths{
		
		public static final String jarDir = Config.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		public static final String curDir = jarDir.substring(0, jarDir.lastIndexOf("/")) + "\\";
		public static final String resDir = curDir + "Res\\";
		
		public static final String xkitHome = "http://xkit.xelcode.com/";
		public static final String mainFile = xkitHome + "DLoad";
	
		public static final String dataDir = resDir + "data\\";
		public static final String guiDir = dataDir + "GUI\\";
		public static final String mapDir = dataDir + "Maps\\";
		public static final String treasureTrailsDir = dataDir + "TreasureTrails\\";
		public static final String dungeonsDir = mapDir + "Dungeons\\";
	}
	
	public static class Versions{
		
		public static String xKit = "0.3";
		public static String mapView = "0.5";
		
	}
	
}
