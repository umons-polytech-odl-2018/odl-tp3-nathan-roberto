package be.ac.umons.odl;

import java.awt.*;

public class Ellipse implements Drawable {
	private final Point centre;
	private final int axex;
	private final int axey;
	public Ellipse(Point centre, int axex, int axey) {
		this.centre = centre;
		this.axex = axex;
		this.axey = axey;
	}

	@Override
	public void draw(Graphics g){
		g.drawOval(this.centre.getX(), this.centre.getY(), this.axex, this.axey);
	}


	public double area(){
		return 2*Math.PI*Math.sqrt((Math.pow(axex,2)+Math.pow(axey,2))/2);
	}
	public double perimeter(){
		return Math.PI*axex*axey;
	}
}

