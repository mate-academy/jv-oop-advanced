package core.basesyntax;

public class RightTriangle extends Figure {
    public float hypotenuse;
    public float base;
    public float secondLeg;

    public RightTriangle(float hypotenuse, float opposite, float adjacent, String color) {
        this.hypotenuse = hypotenuse;
        this.base = base;
        this.secondLeg = secondLeg;
        this.color = Color.valueOf(color);
    }

    public RightTriangle(float hypotenuse, float opposite, float adjacent, Color color) {
        this.hypotenuse = hypotenuse;
        this.base = base;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    protected float getArea() {
        return 0.5f * base * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle has a base of "
                + base
                + " height of "
                + secondLeg
                + " hypotenuse of "
                + hypotenuse
                + " and the area of "
                + getArea());
    }
}
