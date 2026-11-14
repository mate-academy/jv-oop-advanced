package core.basesyntax.enemy;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double firstCatet;
    private double secondCatet;
    private double diagonalCatet;
    private double height;
    private String color;

    public IsoscelesTrapezoid(double height, 
                              double diagonalCatet, 
                              double secondCatet, 
                              double firstCatet,
                              String color) {
        super(color);
        this.firstCatet = firstCatet;
        this.height = height;
        this.diagonalCatet = diagonalCatet;
        this.secondCatet = secondCatet;
    }

    @Override
    public double getArea() {
        return ((firstCatet + secondCatet) / 2) * height;
    }
 
    @Override
    public void draw() {
        System.out.println("First catet - " + firstCatet 
                            + "Second catet - " + secondCatet
                            + "Diagonal - " + diagonalCatet 
                            + "Height - " + height
                            + "Color - " + color
        );
    }
}
