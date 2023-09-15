package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure : rectangle, area: " + calculateArea() + " sq.units, "
                        + "width: " + width + " units, "
                        + "height: " + height + " units, "
                        + "color: " + color);
    }
}
