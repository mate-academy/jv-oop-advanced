package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseA;
    private double baseB;
    private double side;

    protected IsoscelesTrapezoid() {
    }

    protected IsoscelesTrapezoid(String color, double baseA, double baseB, double side) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.side = side;
    }

    protected double getBaseA() {
        return baseA;
    }

    protected void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    protected double getBaseB() {
        return baseB;
    }

    protected void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    protected double getSide() {
        return side;
    }

    protected void setSide(double side) {
        this.side = side;
    }

    @Override
    public void drawShape() {
        System.out.println(String.format("%s%.1f%s%.1f%s%.1f%s%.1f%s%s",
                "Figure: isosceles trapezoid, area: ",
                this.getArea(), " sq. units, base a length: ",
                this.getBaseA(), " units, base b length: ", this.getBaseB(),
                " units, sides length: ", this.getSide(), " units, color: ", this.getColor()));
    }

    @Override
    public double getArea() {
        double semiPerimeter = (baseA + baseB + side + side) / 2;
        return ((baseA + baseB) / 4)
                * Math.sqrt(4 * Math.pow(side, 2) - Math.pow(baseA - baseB, 2));
    }

    @Override
    public Figure getRandomFigure() {
        return new IsoscelesTrapezoid(ColorSupplier.colorGenerator(),
                Math.random() * 100, Math.random() * 100, Math.random() * 100);
    }
}
