package core.basesyntax;

public final class IsoscelesTrapezoid extends Figure {
    private final float sideDown;
    private final float sideUp;
    private final float height;

    public IsoscelesTrapezoid(float sideDown, float sideUp, float height, String color) {
        this.sideDown = sideDown;
        this.sideUp = sideUp;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public float getArea() {
        return (sideUp + sideUp) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + getArea()
                + " sq.units, side Down: "
                + sideDown
                + " units, side Up: "
                + sideUp
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }
}
