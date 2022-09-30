package core.basesyntax;

public class Rectangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    @Override
    public double area() {
        return sideOne * sideTwo;
    }

    @Override
    public Figure drawState() {
        System.out.println("Name = " + getName() + " Area = " + area()
                + " First side = " + sideOne + " Second side = "
                + sideTwo + " Color = " + getColor());
        return null;
    }
}
