package p9_SelectLineOrRectImages;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Component;
import javax.swing.JLabel;


public class MyPanel extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private ArrayList<Shape> shapes;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String selectedShape = "Line";
	
	public MyPanel() {
		shapes = new ArrayList<Shape>();
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setAlignmentY(Component.TOP_ALIGNMENT);
		setBackground(new Color(250,180,180));
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		JRadioButton rdbtnLine = new JRadioButton();
		rdbtnLine.setActionCommand("Line");
		buttonGroup.add(rdbtnLine);
		rdbtnLine.setIcon(new ImageIcon(MyPanel.class.getResource("/p9_SelectLineOrRectImages/line.gif")));
		toolBar.add(rdbtnLine);
		rdbtnLine.addActionListener(this);
		
		
		
		JRadioButton rdbtnRect = new JRadioButton();
		rdbtnRect.setActionCommand("Rect");
		buttonGroup.add(rdbtnRect);
		rdbtnRect.setIcon(new ImageIcon(MyPanel.class.getResource("/p9_SelectLineOrRectImages/rect.gif")));
		toolBar.add(rdbtnRect);
		rdbtnRect.addActionListener(this);
		
		addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("mouse pressed");
				switch(selectedShape) {
					case("Line"):
						shapes.add(new Line(e.getX(),e.getY(),Color.black));
						break;
					case("Rect"):
						shapes.add(new Rectangle(e.getX(),e.getY(),Color.black));
						break;
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouse relesed");
				int lastElement = shapes.size()-1;
				shapes.get(lastElement).setSecondPos(e.getX(), e.getY());
				repaint(); 
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				//System.out.println("mouse draged");
				if (shapes.size() >0) {
					int lastElement = shapes.size()-1; 
					shapes.get(lastElement).setSecondPos(e.getX(), e.getY());
					repaint(); 
				}  	
			}
		});
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(Shape shape:shapes) {
			shape.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("hej");
		selectedShape = e.getActionCommand();
		System.out.printf("%s \n",selectedShape);
	}

	//@Override
	//public void actionPerformed(ActionEvent e) {
	//	selectedShape = e.getActionCommand();
	//	System.out.printf("%s \n",selectedShape);
	//}
}
