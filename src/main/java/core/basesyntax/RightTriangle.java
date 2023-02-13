package core.basesyntax;

public class RightTriangle extends Figure {
    public static final double MAX_FIRST_LEG = 10;
    public static final double MAX_SECOND_LEG = 10;
    private final double firstLeg;
    private final double secondLeg;
    private final TypeFigure name = TypeFigure.TRIANGLE;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public TypeFigure getName() {
        return name;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().name()
                + " area: " + calculateArea() + " sq.units, firstLeg: "
                + getFirstLeg() + " secondLeg: " + getSecondLeg() + " units, color: " + getColor());
    }
}
