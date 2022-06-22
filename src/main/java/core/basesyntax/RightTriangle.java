package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private static final double K = 0.5;

    protected RightTriangle(String color) {
        super(color);
    }

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        area = K * firstLeg * secondLeg;
    }

    public void draw() {
        System.out.println("Figure: triangle, area: " + area + " sq.units," +
                " firstLeg: " + firstLeg + " units," +
                " secondLeg: " + secondLeg + " units," +
                " color: " + color);
    }
}
