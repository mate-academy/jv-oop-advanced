package core.basesyntax;

public final class RightTriangle extends Figure {
    private final float sideA;
    private final float sideB;

    public RightTriangle(float sideA, float sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.setColor(color);
    }

    @Override
    public float getArea() {
        return (sideA * sideB) / 2F;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: "
                + getArea()
                + " sq.units, side A: "
                + sideA
                + " units, side B: "
                + sideB
                + " units, color: "
                + getColor());
    }
}
