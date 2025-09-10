package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int baseRight;
    private final int baseLeft;
    private final int height;

    public IsoscelesTrapezoid(String color, int baseRight, int baseLeft, int height) {
        super(color);
        this.baseRight = baseRight;
        this.baseLeft = baseLeft;
        this.height = height;
    }

    public int getBaseRight() {
        return baseRight;
    }

    public int getBaseLeft() {
        return baseLeft;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseRight + baseLeft) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, baseRight: "
                + baseRight + " units, baseLeft: "
                + baseLeft + " units, height: "
                + height + " units, color: " + getColor());
    }
}
