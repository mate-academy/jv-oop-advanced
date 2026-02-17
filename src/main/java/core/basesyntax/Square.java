package core.basesyntax;

public class Square implements Figure {
    private double squareSide;
    private String color;

    public Square(double squareSide, String color) {
        this.squareSide = squareSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return squareSide * squareSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + squareSide + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
