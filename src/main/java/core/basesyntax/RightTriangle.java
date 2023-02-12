package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final TypeFigure name = TypeFigure.TRIANGLE;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public TypeFigure getName() {
        return name;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public int getFirstLeg() {
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
