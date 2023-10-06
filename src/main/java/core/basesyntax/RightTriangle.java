package core.basesyntax;

public class RightTriangle extends Figure {
    static final  FigType type = FigType.RightTriangle;
    private float firstLeg;
    private float secondLeg;

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
    public RightTriangle(Color color, float firstLeg, float secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea() + " sq.units, firstLeg:"
                + " " + firstLeg + " units, secondLeg: " + secondLeg + " units, color: "
                + getColor());
    }
}
