package p3_panelDrawLine;

import javax.swing.JFrame;

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
