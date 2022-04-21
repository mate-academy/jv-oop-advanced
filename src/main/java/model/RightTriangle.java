package model;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) / 4 * side * side;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle side: " + side
                + ", area: " + getArea()
                + ", color: " + getColor());
    }
}
