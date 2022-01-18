package core.basesyntax;

public class Rectangle  extends Figure implements AreaCalculation {
    private double firstLeg;
    private double secondLeg;
    private String color;
    private double area;

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area = calculatinonArea();
    }

    @Override
    public double calculatinonArea() {
        return getFirstLeg() * getSecondLeg();
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "firstLeg = " + firstLeg +
                ", secondLeg = " + secondLeg +
                ", color = " + color +
                ", area = " + area;
    }
}
