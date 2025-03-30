package org.example;

public class Circle extends Figure{
    private final double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public Circle(){
        super("white");
        this.radius = 10;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(){
        System.out.println("Figure: Circle, area: " + getArea() +
                " sq. units, radius: " + radius + " sq., color: " + getColor());
    }
}
