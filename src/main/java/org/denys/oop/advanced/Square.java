package org.denys.oop.advanced;

public class Square extends Figure {

    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double calculateFigureArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area "
                + calculateFigureArea()
                + ". The side = "
                + getSide()
                + " , the color is "
                + getColor());
    }

}
