package basesyntax;

public class RightTriangle extends Figure {
    private double firstCatet;
    private double secondCatet;

    public RightTriangle(int firstCatet, int secondCatet, Color color) {
        this.firstCatet = firstCatet;
        this.secondCatet = secondCatet;
        this.color = color;
    }

    public void draw() {
        System.out.println("Figure : Right Triangle, Area :" + getArea()
                + " Catet1: " + firstCatet + " Catet2: " + secondCatet
                + " Color: " + color.name()) ;
    }

    @Override
    public double getArea() {
        return (firstCatet * secondCatet) / 2;
    }
}
