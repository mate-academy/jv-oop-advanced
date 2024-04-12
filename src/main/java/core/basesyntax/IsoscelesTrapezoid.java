package core.basesyntax;

class IsoscelesTrapezoid implements Figure {
    private String color;
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(double color, double upperBase, double lowerBase, String height) {
        this.color = String.valueOf(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = Double.parseDouble(height);
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println(getArea() + upperBase + lowerBase + height + color);
    }
}
