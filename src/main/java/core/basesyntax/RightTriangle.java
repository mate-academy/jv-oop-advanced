package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final int hypotenuse;

    public RightTriangle(Color color, int firstLeg, int secondLeg, int hypotenuse) {
        super(Shape.RIGHT_TRIANGLE, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getShape() + ", area: " + getArea()
                + " sq.units, leg base: " + firstLeg + " sq.units, leg height: "
                + secondLeg + " sq.units, hypotenuse: " + hypotenuse
                + " sq.units, color: " + getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return this.firstLeg * this.secondLeg * 0.5;
    }
}
