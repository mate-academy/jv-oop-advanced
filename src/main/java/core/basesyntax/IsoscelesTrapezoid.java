package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int leg;
    private double height;

    public IsoscelesTrapezoid(int baseA, int baseB, int leg, String color) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.leg = leg;
        this.height = Math.sqrt(Math.pow(leg,2)
                - Math.pow(((baseA > baseB) ? (baseA - baseB) : (baseB - baseA)),2));
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + String.format("%.2f", this.getArea()) + " sq. units, "
                + "leg: " + this.leg + " units, "
                + "base A: " + this.baseA + " units, "
                + "base B: " + this.baseB + " units, "
                + "height: " + this.height + " units, "
                + "color: " + this.getColor());
    }

    public double getArea() {
        return ((baseA + baseB) * height) / 2;
    }
}
