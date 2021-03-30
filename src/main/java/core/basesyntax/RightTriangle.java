package core.basesyntax;

public class RightTriangle extends FiguresState implements FiguresArea, DrawProperties {
    private final double oneSide = FigureSupplier.getRandomProperties();
    private final double secondSide = FigureSupplier.getRandomProperties();
    private final double hypotenuse = Math.sqrt(Math.pow(oneSide, 2) + Math.pow(secondSide, 2));
    private final double height = oneSide * secondSide / hypotenuse;

    @Override
    public String getName() {
        String name = "Right Triangle";
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
        return 0.5 * hypotenuse * height;
    }

    @Override
    public String drawIt() {
        return getName() + ", area: " + getArea() + ", " + getUniqueProp() + ", " + getColor();
    }
}
