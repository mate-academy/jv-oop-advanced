package core.basesyntax.figures;

public class Rectangle extends Figure {

    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return Math.round((length * width) * 10.0 / 10.0);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: "
                        + calculateArea()
                        + " sq. units, length: "
                        + length
                        + " units, width: "
                        + width
                        + " units, color: "
                        + color);
    }
}
