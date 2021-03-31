package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawer {
    private String name = "square";
    private final double side;

    public Square() {
        name = "square";
        side = FigureSupplier.getRandomProperties();
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
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea() + ", side: " + getUniqueProp() + ", color: " + getColor();
    }
}
