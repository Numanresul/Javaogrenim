package ikinciprogram;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class BizimPencere extends JFrame {

	private Random rnd;
	
	public BizimPencere() {
		super();
		rnd= new Random();
		
		
	}
	
	public void paint (Graphics g)
	{
		super.paint(g);
		// verilen kordinatlara göre dikdörtgen ve çizgi cizen kodlar
		//g.drawRect(160, 120, 340,300 );
		//g.drawRect(320, 300, 100,160 );
		//g.drawLine(0, 0, 640, 480);
	
		for(int i=0;i<100;i++)
		{
			g.drawLine(rnd.nextInt(640),rnd.nextInt(480),rnd.nextInt(640),rnd.nextInt(480));
		}
	
	}
}
