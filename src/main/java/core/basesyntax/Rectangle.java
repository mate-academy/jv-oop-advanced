package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawer {
    private final double weight = FigureSupplier.getRandomProperties();
    private final double height = FigureSupplier.getRandomProperties();
    private final String name;
    private final double perimeter;
    public Rectangle() {
        name = "rectangle";
        perimeter = weight + height;
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
        return perimeter;
    }

    @Override
    public double getArea() {
        return weight * height;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea() + ", perimeter: " + getUniqueProp() + ", color: " + getColor();

    }
}
