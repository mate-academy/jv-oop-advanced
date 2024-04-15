package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int heigh;
    private int lowSide;
    private int hightSide;
    private Colors color;

    public IsoscelesTrapezoid() {
        this.heigh = random.nextInt(1, 11);
        this.lowSide = random.nextInt(1, 11);
        this.hightSide = random.nextInt(1, 11);
        this.color = colorSupplier.getRandomColor();
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
