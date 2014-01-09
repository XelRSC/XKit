package com.xkit;

import java.awt.Container;

import com.ploader.Plugin;
import com.xkit.gui.XkitGui;

/***
 *@author Xel
 *@version 1.0
 *@project XkitPl
 *@file Xkit.java
 *@date 9.1.2014
 *@time 7.42.27
 */
public class Xkit extends Plugin{
	
	public Xkit(){
		
	}

	@Override
	public Container gui() {
		return new XkitGui(this);
	}

	@Override
	public boolean exit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}


}
