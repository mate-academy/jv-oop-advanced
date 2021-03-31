package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Drawer {
    private final String name;
    private final double radius;

    public Circle() {
        name = "circle";
        radius = FigureSupplier.getRandomProperties();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return ColorSupplier.getRandomColor();
    }

    @Override
    public double getUniqueProp() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea() + ", radius: " + getUniqueProp() + ", color: " + getColor();
    }
}
