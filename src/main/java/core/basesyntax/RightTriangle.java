package core.basesyntax;

public class RightTriangle extends Figure {
    private float firstLeg;
    private float secondLeg;
    private double area;

    public RightTriangle(Color color, float firstLeg, float secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.area = getArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: " + area
                + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}

