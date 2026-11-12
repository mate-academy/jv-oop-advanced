package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private double firstCatet;
    private double secondCatet;
    private double diagonal;
    private double height;

    @Override
    public double getArea() {
        return ((firstCatet + secondCatet) / 2) * height;
    }    

    @Override 
    public void draw() {
        System.out.println("First catet - " + firstCatet 
                            + "Second catet - " + secondCatet
                            + "Diagonal - " + diagonal 
                            + "Height - " + height
        );
    }
}
