package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int heigh;
    private int lowSide;
    private int hightSide;
    private Colors color;

    public IsoscelesTrapezoid() {
        this.heigh = getRandom().nextInt(1, 11);
        this.lowSide = getRandom().nextInt(1, 11);
        this.hightSide = getRandom().nextInt(1, 11);
        this.color = getColorSupplier().getRandomColor();
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
                + hightSide + " units, color: " + color);
    }
}
