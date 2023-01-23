package core.basesyntax;

public class Rectangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public Rectangle(Colors color, Figures typeOfFigure, double sideOne, double sideTwo) {
        super(color, typeOfFigure);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getSquare() {
        return sideOne * sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeOfFigure() + ", area: " + getSquare()
                + " sq.units, First side: " + sideOne + " units, Second side: " + sideTwo
                + " units, color: " + getColor());
    }
}
