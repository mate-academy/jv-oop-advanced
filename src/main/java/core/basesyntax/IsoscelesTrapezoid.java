package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideOne;
    private double sideTwo;
    private double height;

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return ((sideOne + sideTwo) / 2) * height;
    }

    @Override
    public Figure drawState() {
        System.out.println("Name = " + getName() + " Area = " + area()
                + " First side = " + sideOne + " Second side = " + sideTwo
                + " Height = " + height + " Color = " + getColor());
        return null;
    }
}
