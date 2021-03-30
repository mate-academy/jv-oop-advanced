package core.basesyntax;

public class Square extends FiguresState implements FiguresArea, DrawProperties {
    private final double side = FigureSupplier.getRandomProperties();

    @Override
    public String getName() {
        String name = "Square";
        return "Figure: " + name;
    }

    @Override
    public String getColor() {
        return "color: " + ColorSupplier.getRandomColor();
    }

    @Override
    public String getUniqueProp() {
        return "side: " + side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String drawIt() {
        return getName() + ", area: " + getArea() + ", " + getUniqueProp() + ", " + getColor();
    }
}

