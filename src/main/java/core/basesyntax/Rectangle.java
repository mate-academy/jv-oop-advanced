package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawable {
    private double sideA;
    private double sideB;
    private String color;

    public Rectangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String getColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        color = colorSupplier.getRandomColor();
        return color;
    }

    @Override
    public String draw() {
        return "Figure: rectangle. SideA: " + sideA + " mm." + " SideB: " + sideB
                + "mm. Area: " + getArea() + " sq.mm. Color: " + color;
    }
}
