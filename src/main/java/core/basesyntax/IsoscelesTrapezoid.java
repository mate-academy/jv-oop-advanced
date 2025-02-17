package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements GetArea, Draw {

    private double firstLeg;
    private double secondLeg;
    private double height;
    private double area = (firstLeg + secondLeg) * height / 2;

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

    @Override
    public double area() {
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + area() + " sq. units, " + "FirstLeg: " + firstLeg + ", SecondLeg: " + secondLeg + ", Height: " + height + ", Color: " + getColor());
    }
}
