/*
 * Edwin J. Estrella Ayala
 * A00549508
 * Graficas por Computadoras - COMP 3600 (70858)
 * Asignación - Diseño de Gráficos Utilizando Elipses y Rectángulos
 */

import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class GraphicComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		/*
		 * Blue
		 */
		g2.setColor(new Color(153, 217, 234));
		Ellipse2D.Double background = new Ellipse2D.Double(0, 0, 400, 400);
		g2.fill(background);
		/*
		 * Gray
		 */
		g2.setColor(new Color(127, 127, 127));
		Rectangle body = new Rectangle(150, 95, 60, 200);
		g2.fill(body);
		/*
		 * Brown
		 */
		g2.setColor(new Color(185, 122, 87));
		Rectangle head = new Rectangle(150, 50, 60, 35);
		g2.fill(head);
		Rectangle mouth1 = new Rectangle(210, 50, 40, 12);
		g2.fill(mouth1);
		Rectangle mouth2 = new Rectangle(210, 72, 40, 13);
		g2.fill(mouth2);
		Rectangle arm = new Rectangle(190, 170, 60, 12);
		g2.fill(arm);
		Rectangle hand1 = new Rectangle(240, 160, 30, 10);
		g2.fill(hand1);
		Rectangle hand2 = new Rectangle(240, 180, 30, 10);
		g2.fill(hand2);
		Rectangle leg1 = new Rectangle(165, 245, 30, 70);
		g2.fill(leg1);
		Rectangle leg2 = new Rectangle(175, 315, 10, 50);
		g2.fill(leg2);
		Rectangle foot = new Rectangle(185, 355, 30, 10);
		g2.fill(foot);
		/*
		 * Green
		 */
		g2.setColor(new Color(134, 177, 76));
		Rectangle handN1 = new Rectangle(263, 162, 5, 5);
		g2.fill(handN1);
		Rectangle handN2 = new Rectangle(263, 183, 5, 5);
		g2.fill(handN2);
		Rectangle legGreen = new Rectangle(174, 255, 12, 50);
		g2.fill(legGreen);
		Rectangle footN= new Rectangle(207, 357, 5, 5);
		g2.fill(footN);		
		/*
		 * Yellow
		 */
		g2.setColor(Color.YELLOW);
		Rectangle legYellow = new Rectangle(177, 260, 5, 40);
		g2.fill(legYellow);
		Ellipse2D.Double outEye = new Ellipse2D.Double(175, 55, 20, 14);
		g2.fill(outEye);				
		/*
		 * Black
		 */
		g2.setColor(Color.BLACK);
		Rectangle nose = new Rectangle(243, 52, 5, 6);
		g2.fill(nose);			
		/*
		 * Red
		 */
		g2.setColor(Color.RED);
		Ellipse2D.Double inEye = new Ellipse2D.Double(182, 55, 5, 13);
		g2.fill(inEye);
	}
	
	public static void main(String[] args) {
		JFrame marco = new JFrame("Marco");
		marco.setSize(720, 720);
		marco.setTitle("Diseño de Gráficos Utilizando Elipses y Rectángulos");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		GraphicComponent grafico = new GraphicComponent();
		marco.add(grafico);
	}
}
