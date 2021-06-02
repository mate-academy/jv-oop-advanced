package state;

public class RightTriangle implements Shape{
    private double sideLeft;
    private double sideRight;
    private double baseOfRectangle;

    public RightTriangle(double sideLeft, double sideRight, double baseOfRectangle) {

    }

    @Override
    public double getArea() {
        return (baseOfRectangle / 2) * (Math.sqrt((sideLeft * sideLeft) - ((sideRight * sideRight) / 4)));
    }
}
