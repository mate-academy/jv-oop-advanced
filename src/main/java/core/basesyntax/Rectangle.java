package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    {
        setFigureType("rectangle");
    }

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    double countArea() {
        return firstSide * secondSide;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: "
                + getFigureType() + ", area: "
                + countArea() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: "
                + secondSide + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
