package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int leg;
    private int firstBase;
    private int secondBase;

    public IsoscelesTrapezoid(String color, int leg, int firstBase, int secondBase) {
        super(color);
        this.leg = leg;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        double triangleLeg = Math.abs(firstBase - secondBase);
        double height = Math.sqrt(Math.pow(leg, 2) - Math.pow(triangleLeg, 2) / 4);
        double area = (firstBase + secondBase) * height / 2;
        return (double) Math.round(area * 100) / 10;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, Leg: "
                + leg + " units, firstBase: " + firstBase + " units, secondBase: "
                + secondBase + " color: " + getColor().toLowerCase());
    }
}
