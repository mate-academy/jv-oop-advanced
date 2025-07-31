package org.denys.oop.advanced;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(String color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide1() {
        return side1;
    }

    @Override
    public double calculateFigureArea() {
        return side1 * side2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: "
                + calculateFigureArea()
                + ". The side1 = "
                + getSide1()
                + ", the side2 = "
                + getSide2()
                + ", the color is " + getColor());
    }

}
