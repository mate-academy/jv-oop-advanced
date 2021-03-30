package core.basesyntax;

public class IsoscelesTrapezoid extends FiguresState implements FiguresArea, DrawProperties {
    private final double firstBaseSide = FigureSupplier.getRandomProperties();
    private final double secondBaseSide = FigureSupplier.getRandomProperties();
    private final double height = FigureSupplier.getRandomProperties();

    @Override
    public String getName() {
        String name = "Isosceles Trapezoid";
        return "Figure: " + name;
    }

    @Override
    public String getColor() {
        return "color: " + ColorSupplier.getRandomColor();
    }

    @Override
    public String getUniqueProp() {
        return "height: " + height;
    }

    @Override
    public double getArea() {
        return ((firstBaseSide + secondBaseSide) / 2) * height;
    }

    @Override
    public String drawIt() {
        return getName() + ", area: " + getArea() + ", " + getUniqueProp() + ", " + getColor();
    }
}
