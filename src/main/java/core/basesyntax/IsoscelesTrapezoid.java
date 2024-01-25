package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double lowBase;
    private final double topBase;
    private final double leg;

    public IsoscelesTrapezoid(String color, double lowBase, double topBase, double leg) {
        super(color);
        this.lowBase = lowBase;
        this.topBase = topBase;
        this.leg = leg;
    }

    public double getLowBase() {
        return lowBase;
    }

    public double getTopBase() {
        return topBase;
    }

    public double getLeg() {
        return leg;
    }

    @Override
    public double getArea() {
        return (topBase + lowBase) * leg / 2;
    }

    @Override
    public void draw() {
        System.out.println("This is " + super.getColor().toLowerCase() + " Isosceles Trapezoid "
                + "with bases of " + topBase + ", " + lowBase + "; legs of "
                + leg + ", and area of " + getArea());
    }
}
