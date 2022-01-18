package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculation {
    private double firstLeg;
    private double secondLeg;
    private String color;
    private double area ;

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
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return "Right Triangle: " +
                "firstLeg = " + firstLeg +
                ", secondLeg = " + secondLeg +
                ", color = " + color +
                ", area = " + area;
    }
}
