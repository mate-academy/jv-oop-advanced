package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Shape: rectangle, area: " + calculateArea() + "square units width: "
                + width + "height units: " + height + "color units: " + getColor());
    }
}
