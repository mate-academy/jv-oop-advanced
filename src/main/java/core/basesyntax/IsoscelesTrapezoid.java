package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2) * height;
    }

    @Override
    protected String getParametersString() {
        return "upper base: " + String.format("%.2f", topBase)
                + " units, lower base: " + String.format("%.2f", bottomBase)
                + " units, height: " + String.format("%.2f", height) + " units";

    }

}

