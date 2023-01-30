package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    {
        setFigureType("right triangle");
    }

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    double countArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: "
                + getFigureType() + ", area: "
                + countArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
