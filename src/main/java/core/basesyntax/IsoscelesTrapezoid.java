package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseSideA;
    private int baseSideB;
    private int height;

    public IsoscelesTrapezoid(Color color, int baseSideA, int baseSideB, int height) {
        super(color);
        this.baseSideA = baseSideA;
        this.baseSideB = baseSideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid, area:" + obtainArea()
                + " sq. units, base first length: " + baseSideA
                + " units, base second length: " + baseSideB
                + " units, height: " + height
                + " units, color: " + super.getColor());
    }

    @Override
    public int obtainArea() {
        return (int) (0.5 * height * (baseSideA + baseSideB));
    }
}
