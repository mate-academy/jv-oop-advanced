package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure : right triangle" + " Area : " + getArea()
                + " First leg : " + getFirstLeg()
                + " Second leg : " + getSecondLeg() + " Color : " + getColor());
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return "Figure : right triangle" + " Area : " + getArea() + " First leg : " + getFirstLeg()
                + " Second leg : " + getSecondLeg() + " Color : " + getColor();
    }
}
