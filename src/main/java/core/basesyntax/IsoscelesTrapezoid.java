package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final float base1;
    private final float base2;
    private final float height;

    public IsoscelesTrapezoid(Color color, float base1, float base2, float height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.getArea()
                + " sq. units, base1: " + this.base1 + " units, base2: " + this.base2
                + " units, height: " + this.height + ", color: "
                + this.getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2;
    }
}
