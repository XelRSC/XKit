package com.xkit;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel;

/***
 *@author Xel
 *@version 1.0
 *@project XkitPl
 *@file TempBooter.java
 *@date 9.1.2014
 *@time 7.54.00
 */
public class TempBooter extends JFrame{
	
	public static void main(final String[] args){
		new TempBooter();
	}
	
	public TempBooter() {
		try{
			SwingUtilities.invokeLater(new Runnable(){

				@Override
				public void run() {
					try {
						UIManager.setLookAndFeel(new SubstanceGraphiteLookAndFeel());
					} catch (final UnsupportedLookAndFeelException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}});
			
		}catch(final Exception e){}
		setBounds(0,0,280,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final Xkit xkit = new Xkit();
		this.getContentPane().add(xkit.gui(), BorderLayout.CENTER);
		this.revalidate();
	}

}
