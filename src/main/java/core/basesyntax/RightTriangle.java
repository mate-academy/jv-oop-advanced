package core.basesyntax;

public class RightTriangle extends Figure {

    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(String.valueOf(color));
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area : " + getArea()
                + " sq. units, firstLeg: " + firstLeg
                + " secondLeg: " + secondLeg + " units, color: " + color);
    }
}

