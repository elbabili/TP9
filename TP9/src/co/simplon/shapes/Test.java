package co.simplon.shapes;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Circle c1 = new Circle(2.0,3,7);		
		//System.out.println(c1);
		
		Square s1 = new Square(3,7,10);
		//System.out.println(s1);
		
		Point p = new Point(3,15);
		Circle c2 = new Circle(1.5,p);
		//System.out.println(c2);
			
		ArrayList<Shape> shapes = new ArrayList<>();
        
        shapes.add(c1);
        shapes.add(s1);
        shapes.add(c2);
		shapes.add( new Circle( 1,new Point( 5, 5 ) ) );
        shapes.add( new Square( -2,new Point( 1, 1 ) ) );
        shapes.add( new Circle() );
        shapes.add( new Triangle(2,3,5,5));
        
        for( Shape shape : shapes ) {
            System.out.println(shape + " area = " + shape.area() );
        }
	}
}