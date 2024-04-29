package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int heigh;
    private int lowSide;
    private int hightSide;

    public IsoscelesTrapezoid() {
        this.heigh = getRandomNum();
        this.lowSide = getRandomNum();
        this.hightSide = getRandomNum();
    }

    @Override
    public double getArea() {
        return this.heigh / 2 * (this.lowSide + this.hightSide);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + getArea()
                + " sq. units, " + "height: " + heigh
                + " low Side: " + lowSide + " units, hight Side: "
                + hightSide + " units, color: " + getColor());
    }
}
