package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private float baseA;
    private float baseB;
    private float height;

    public IsoscelesTrapezoid(float baseA, float baseB, float height, String color) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        this.color = Color.valueOf(color);
    }

    public IsoscelesTrapezoid(float baseA, float baseB, float height, Color color) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        this.color = color;
    }

    @Override
    public float getArea() {
        return (baseA + baseB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid has a base of "
                + baseA
                + " another base of "
                + baseB
                + " height of "
                + height
                + " and the area of "
                + getArea());
    }
}
