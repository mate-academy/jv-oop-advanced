package core.basesyntax;

public class RightTriangle extends Figure implements GetArea,Draw {

    private double firstLeg;
    private double secondLeg;
    private double height;
    private double area = firstLeg * secondLeg / 2;

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double area() {
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: Triangle, area: " + area() + " sq. units, " + "FirstLeg: " + firstLeg + ", SecondLeg: " + secondLeg + ", Height: " + height + ", Color: " + getColor());
    }
}
