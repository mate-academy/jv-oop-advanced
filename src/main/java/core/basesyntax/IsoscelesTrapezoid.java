package core.basesyntax;

class IsoscelesTrapezoid extends AbstractFigure {
    private String color;
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, String color) {
        this.color = color;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println(getArea() + upperBase + lowerBase + height + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
