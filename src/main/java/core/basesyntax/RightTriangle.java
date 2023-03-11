package core.basesyntax;

public class RightTriangle extends Figure {

    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle: color = "
                + getColor()
                + ", first leg = "
                + firstLeg + ", second leg = "
                + secondLeg + ", area = "
                + getArea() + " sq.units.");
    }
}
