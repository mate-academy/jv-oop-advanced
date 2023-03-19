package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double lengthOfBaseOfRectangle;

    @Override
    public double getArea() {
        return (height * lengthOfBaseOfRectangle) / 2;
    }

    @Override
    public void printInformation() {
        System.out.println();
    }
}
