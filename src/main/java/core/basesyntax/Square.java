package core.basesyntax;

public class Square extends Figure {
    private double squareSide;

    public Square(String color, double squareSide) {
        super(color);
        this.squareSide = squareSide;
    }

    public double getSquareSide() {
        return squareSide;
    }

    public void setSquareSide(double squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public double getArea() {
        return Math.pow(squareSide, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure is Square"
                + ", Color is " + getColor()
                + ", Square Side = " + squareSide
                + ", Area = " + getArea());
    }

}
