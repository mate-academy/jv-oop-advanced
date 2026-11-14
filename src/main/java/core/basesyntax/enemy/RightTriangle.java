package core.basesyntax.enemy;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double firstCatet;
    private double secondCatet;

    public RightTriangle(double firstCatet, double secondCatet, String color) {
        super(color);

        this.firstCatet = firstCatet;
        this.secondCatet = secondCatet;
    }

    @Override
    public double getArea() {
        return (firstCatet * secondCatet) / 2;
    }

    @Override
    public void draw() {
        System.out.println("First catet - " + firstCatet
                            + "Second catet - " + secondCatet
                            + "Diagonal - " + getDiagonal()
                            + "Color - " + color
        );
    }

    private double getDiagonal() {
        double result = (firstCatet * firstCatet) + (secondCatet * secondCatet);
        return Math.sqrt(result);
    }
}
