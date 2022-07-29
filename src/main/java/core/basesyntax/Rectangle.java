package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double weight;

    public Rectangle() {
    }

    public Rectangle(double length, double weight, double area, String color) {
        super(color, area);
        this.length = length;
        this.weight = weight;
    }

    @Override
    public void draw() {
        System.out.println("rectangle, " + "area: " + getArea() + " sq.units,"
                + " length: " + length + " units," + " weight: "
                + weight + " units," + " color: " + getColor());
    }
}
