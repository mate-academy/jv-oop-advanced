package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawer {
    private final double firstBaseSide = FigureSupplier.getRandomProperties();
    private final double secondBaseSide = FigureSupplier.getRandomProperties();
    private final String name;
    private final double height;

    public IsoscelesTrapezoid() {
        name = "isosceles trapezoid";
        height = FigureSupplier.getRandomProperties();
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
        return height;
    }

    @Override
    public double getArea() {
        return ((firstBaseSide + secondBaseSide) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: " + getName()
            + ", area: " + getArea()
            + ", height: " + getUniqueProp()
            + ", color: " + getColor();
    }
}
