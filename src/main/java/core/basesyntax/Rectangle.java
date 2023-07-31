package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: rectangle, area: %s sq.units, side1: %s units, side2: %s units, color: %s"
                , this.getArea(), this.side1, this.side2, this.getColor()));
    }
}
