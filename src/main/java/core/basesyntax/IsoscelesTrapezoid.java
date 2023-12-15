package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, String color) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
        setColor(color);
    }

    public double calculateArea() {
        return (upperBase + lowerBase) * height / 2;
    }

    public String getName() {
        return "isosceles trapezoid";
    }

    public String draw() {
        return "upper base: " + upperBase + " unit, lower base: " + lowerBase
                + " unit, height: "
                + height + " unit, " + "color: " + getColor();
    }
}
