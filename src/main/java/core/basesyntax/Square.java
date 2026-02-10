package core.basesyntax;

public class Square extends Figure {
    private final double side;
    private final String color;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square," + " area: " + getArea() + " sq. units,"
                + " side: " + side + " units, " + "color: " + getColor());
    }
}
