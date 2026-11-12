package core.basesyntax;

public class RightTriangle implements Figure {
    private double firstCatet;
    private double secondCatet;

    @Override 
    public double getArea() {
        return (firstCatet * secondCatet) / 2;
    }

    @Override 
    public void draw() {
        System.out.println("First catet - " + firstCatet
                            + "Second catet - " + secondCatet
                            + "Diagonal - " + getDiagonal()
        );
    }

    private double getDiagonal() {
        double result = (firstCatet * firstCatet) + (secondCatet * secondCatet);
        return Math.sqrt(result);
    }
}
