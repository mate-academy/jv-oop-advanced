package core.basesyntax;

public class Square extends Figure {
    private double firstSide;

    public Square(String color, double firstSide) {
        super(color);
        this.firstSide = firstSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    @Override
    public double area() {
        return Math.pow(firstSide, 2);
    }

    @Override
    public void printFigure() {
        System.out.println("Figure Square has area " + Math.round(area())
                + " and color " + this.getColor());

    }
}
