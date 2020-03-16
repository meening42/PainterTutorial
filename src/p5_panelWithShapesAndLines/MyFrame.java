package p5_panelWithShapesAndLines;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;
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
