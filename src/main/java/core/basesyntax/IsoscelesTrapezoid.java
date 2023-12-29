package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(
            double upperBase, double lowerBase, double height, String color) {
        super("isosceles trapezoid", color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (upperBase + lowerBase) * height / 2;
    }

    @Override
    public long draw() {
        String figureDetails = "upper base: " + upperBase + " unit, lower base: " + lowerBase
                + " unit, height: " + height + " unit, " + "color: " + getColor();

        System.out.println(super.draw());
        System.out.println(figureDetails);
        return 0;
    }
}
