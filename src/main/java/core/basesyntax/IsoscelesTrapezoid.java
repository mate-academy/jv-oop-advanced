package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculation {
    private double firstLeg;
    private double secondLeg;
    private double height;
    private String color;
    private double area;

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double calculatinonArea() {
        return ((firstLeg + secondLeg) / 2) * height;
    }

    public double getArea() {
        return area = calculatinonArea();
    }

    @Override
    public String toString() {
        return "Isosceles Trapezoid: " +
                "firstLeg = " + firstLeg +
                ", secondLeg = " + secondLeg +
                ", height = " + height +
                ", color = " + color +
                ", area = " + area;
    }
}
