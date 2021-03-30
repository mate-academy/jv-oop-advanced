package core.basesyntax;

public class Rectangle extends FiguresState implements FiguresArea, DrawProperties {
    private final double weight = FigureSupplier.getRandomProperties();
    private final double height = FigureSupplier.getRandomProperties();
    private final double perimeter = weight + height;

    @Override
    public String getName() {
        String name = "Rectangle";
        return "Figure: " + name;
    }

    @Override
    public String getColor() {
        return "color: " + ColorSupplier.getRandomColor();
    }

    @Override
    public String getUniqueProp() {
        return "perimeter: " + perimeter;
    }

    @Override
    public double getArea() {
        return weight * height;
    }

    @Override
    public String drawIt() {
        return getName() + ", area: " + getArea() + ", " + getUniqueProp() + ", " + getColor();
    }
}
