package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.area = getArea();

    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    public void draw() {
        System.out.println("Figure: " + "right triangle, "
                + "area: " + area + " sq.units, "
                + "first leg: " + firstLeg + " units, "
                + "second leg: " + secondLeg + " units, "
                + "color: " + color.toLowerCase()
        );
    }
}
