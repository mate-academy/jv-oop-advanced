package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + calculate()
                + " sq. units, first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + color.name().toLowerCase());
    }

    @Override
    public double calculate() {
        return firstLeg * secondLeg;
    }
}
