package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double leg1;
    private double leg2;
    private double heigh;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double heigh){
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.heigh = heigh;
    }
    @Override
    public double getArea() {
        return ((leg1 + leg2) * heigh) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, color: " + getColor() + " , first leg: "
                + leg1 + "second led: " + leg2 + " ,heigh" + heigh
                + " , area: " + getArea());
    }
}
