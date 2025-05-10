package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(
            double upperBase, double lowerBase, double height, String color) {
        super(IsoscelesTrapezoid.class.getSimpleName(), color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (upperBase + lowerBase) * height / 2;
    }

    @Override
    public void draw() {
        String figureDetails = "upper base: " + upperBase + " unit, lower base: " + lowerBase
                + " unit, height: " + height + " unit, " + "color: " + getColor();

        super.draw();
        System.out.println("figure: " + getName() + ", square: "
                + calculateArea() + " sq.units.");
        System.out.println(figureDetails);
    }
}
