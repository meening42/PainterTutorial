package p3_panelDrawLine;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame {
	private MyPanel pnl;

	public MyFrame(String sTitle) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle(sTitle);
		pnl  =  new MyPanel();
		add(pnl);
		pnl.setVisible(true);
	}

}
