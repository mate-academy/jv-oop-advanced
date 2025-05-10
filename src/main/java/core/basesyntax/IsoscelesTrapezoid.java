package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private float firstBase;
    private float secondBase;
    private float height;

    public IsoscelesTrapezoid(String color, float firstBase, float secondBase, float height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public float getArea() {
        return firstBase * secondBase * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first base: " + firstBase + " units, second base: "
                + secondBase + " units, height: " + height + " units, color: " + getColor());
    }
}
