package core.basesyntax;

public class Circle extends FiguresState implements FiguresArea, DrawProperties {
    private final double radius = FigureSupplier.getRandomProperties();

    public String getName() {
        String name = "Circle";
        return "Figure: " + name;
    }

    @Override
    public String getColor() {
        return "color: " + ColorSupplier.getRandomColor();
    }

    @Override
    public String getUniqueProp() {
        return "radius: " + radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String drawIt() {
        return getName() + ", area: " + getArea() + ", " + getUniqueProp() + ", " + getColor();
    }
}
