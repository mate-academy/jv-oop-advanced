package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.width = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea()
                + " sq.units, width: "
                + width
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }
}
