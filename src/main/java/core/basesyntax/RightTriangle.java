package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    RightTriangle(String color, double randomFirstLeg, double randomSecondLeg) {
        super(color);
        this.firstLeg = randomFirstLeg;
        this.secondLeg = randomSecondLeg;
    }

    @Override
    String printFigureType() {
        return "Figure: triangle";
    }

    @Override
    public double printArea() {
        return (firstLeg * secondLeg) * 0.5;
    }

    @Override
    public void draw() {
        System.out.println(printFigureType()
                + " area: "
                + printArea()
                + " sq.units, firstLeg: "
                + firstLeg
                + " units, secondLeg: "
                + secondLeg
                + " units, color: "
                + getColor());
    }
}
