package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Drawer {
    private final double oneSide = FigureSupplier.getRandomProperties();
    private final double secondSide = FigureSupplier.getRandomProperties();
    private final double hypotenuse = Math.sqrt(Math.pow(oneSide, 2) + Math.pow(secondSide, 2));
    private final String name;
    private final double height;

    public RightTriangle() {
        name = "right triangle";
        height = oneSide * secondSide / hypotenuse;
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
        return 0.5 * hypotenuse * height;
    }

    @Override
    public String draw() {
        return "Figure: " + getName()
            + ", area: " + getArea()
            + ", height: " + getUniqueProp()
            + ", color: " + getColor();
    }
}
