package model;

public class Rectangle extends Figure implements Area, Draw {
    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void drawing() {
        System.out.println("Rectangle length: " + length
                + ", wight: " + width
                + ", area: " + getArea()
                + ", color: " + getColor());
    }
}
