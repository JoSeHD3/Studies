package kolos2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Zadanie1 implements MouseListener{

	public String currentMousePosition;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(new BorderLayout());
	JLabel label1 = new JLabel();
	Zadanie1(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(Color.black);
		panel.setSize(new Dimension(600, 400));
		panel.setVisible(true);
		frame.add(panel);
	}
	public static void main(String[] args) {
			Zadanie1 windw = new Zadanie1();
	}
	
	private void setCoords(int x, int y) {
		currentMousePosition = x + " | " + y;
		label1.setVerticalTextPosition(x);
		label1.setHorizontalTextPosition(y);
		label1.setText(currentMousePosition);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		setCoords(e.getX(), e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}