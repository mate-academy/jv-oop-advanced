package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private final Color rightriangleColor;

    public RightTriangle(Color randomColor, double firstLeg, double secondLeg) {
        super(Parameters.DEFAULT_COLOR);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.rightriangleColor = randomColor;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea()
                + " sq.units, firstLeg: "
                + firstLeg
                + " units, secondLeg: "
                + secondLeg
                + " units, color: "
                + rightriangleColor);
    }
}
