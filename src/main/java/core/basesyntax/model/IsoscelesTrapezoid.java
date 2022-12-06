package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double firstSize;
    private double secondSize;
    private double thirdSize;

    public IsoscelesTrapezoid(String color,
                              double lengthSizeOne,
                              double lengthSizeTwo,
                              double lengthSizeThree) {
        super(color);
        this.firstSize = lengthSizeOne;
        this.secondSize = lengthSizeTwo;
        this.thirdSize = lengthSizeThree;
    }

    public double getFirstSize() {
        return firstSize;
    }

    public void setFirstSize(double firstSize) {
        this.firstSize = firstSize;
    }

    public double getSecondSize() {
        return secondSize;
    }

    public void setSecondSize(double secondSize) {
    }

    public double getThirdSize() {
        return thirdSize;
    }

    public void setThirdSize(double thirdSize) {
    }

    @Override
    public double getArea() {
        return ((firstSize + secondSize) / 2) * thirdSize;
    }

    @Override
    public void draw() {
        System.out.println("Figure IsoscelesTrapezoid, total measure: " + getArea()
                + ", Color: " + getColor() + ", first side is: " + getFirstSize()
                + ", second side is: " + getSecondSize() + ", third side is: " + getThirdSize());
    }
}


