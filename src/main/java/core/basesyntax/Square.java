package org.example;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Shape: square, area: " + area()
                + "sq. units, side: " + side + "sq. units, color: " + getColor());
    }
}
