package core.basesyntax;

public class Square implements Figure {
    private double squeareSide;
    private String color;

    public Square(double squeareSide, String color) {
        this.squeareSide = squeareSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return squeareSide * squeareSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + squeareSide + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
