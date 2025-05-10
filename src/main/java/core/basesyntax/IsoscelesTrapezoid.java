package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea() 
                + " sq.units, upper base: " + upperBase + " units, lower base: " + lowerBase 
                + " units, height: " + height + " units, color: " + color);
    }
}
