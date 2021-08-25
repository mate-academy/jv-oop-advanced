package core.basesyntax;

public final class Rectangle extends Figure {
    private final float sideA;
    private final float sideB;

    public Rectangle(float sideA, float sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.setColor(color);
    }

    @Override
    public float getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + getArea()
                + " sq.units, side A: "
                + sideA
                + " units, side B: "
                + sideB + " units, color: "
                + getColor());
    }
}
