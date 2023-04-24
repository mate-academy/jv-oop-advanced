package core.basesyntax;

public class Rectangle extends Figure {
    private double randomSide1;
    private double randomSide2;

    Rectangle(String color, double randomSide1, double randomSide2) {
        super(color);
        this.randomSide1 = randomSide1;
        this.randomSide2 = randomSide2;
    }

    @Override
    String printFigureType() {
        return "Figure: rectangle";
    }

    @Override
    public double printArea() {
        return randomSide1 * randomSide2;
    }

    @Override
    public void draw() {
        System.out.println(printFigureType()
                + " area: "
                + printArea()
                + " sq.units, firstSide: "
                + randomSide1
                + " units, secondSide: "
                + randomSide2
                + " units, color: "
                + getColor());
    }
}
