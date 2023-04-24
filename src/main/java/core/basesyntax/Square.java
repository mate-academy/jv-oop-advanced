package core.basesyntax;

public class Square extends Figure {
    private double randomSide;

    Square(String color, double randomSide) {
        super(color);
        this.randomSide = randomSide;
    }

    @Override
    String printFigureType() {
        return "Figure: square,";
    }

    @Override
    public double printArea() {
        return randomSide * randomSide;
    }

    @Override
    public void draw() {
        System.out.println(printFigureType()
                + " area: "
                + printArea()
                + " sq.units, side: "
                + randomSide
                + " units, color: "
                + getColor());
    }
}
