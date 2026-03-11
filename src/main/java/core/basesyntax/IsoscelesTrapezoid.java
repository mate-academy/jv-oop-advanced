package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double legA;
    private final double legB;
    private final double legC;

    public IsoscelesTrapezoid(String color, double legA, double legB, double legC) {
        super(color);
        this.legA = legA;
        this.legB = legB;
        this.legC = legC;
    }

    @Override
    public double getArea() {
        return (legA + legB + legC) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + this.getArea()
                + "sq. units, legA: "
                + this.legA
                + " units, legB: "
                + this.legB
                + " units, legC: "
                + this.legC
                + " units, color: "
                + this.getColor());
    }
}
