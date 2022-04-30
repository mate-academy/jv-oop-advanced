package core.basesyntax;

public class RightTriangle extends Figure implements Area, Draw {
    private static final String name = "triangle";
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Colors color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double areaCalculator() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f firstLeg: %d units, " +
                        "secondLeg: %d units, color: %s",
                name, areaCalculator(), firstLeg, secondLeg, getColor().toString());

    }
}
