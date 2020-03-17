package p8_panelMakeLineOrRect;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MyFrame(String sTitle) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle(sTitle);
		MyPanel pnl  =  new MyPanel();
		setContentPane(pnl);
		pnl.setVisible(true);
	}

}
