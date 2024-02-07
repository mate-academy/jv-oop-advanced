package core.basesyntax;

public class Rectangle extends Figure {
    private double base;
    private double height;

    public Rectangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String getUniqueProperties() {
        return "base: " + base + ", height: " + height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }
}
