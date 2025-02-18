package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements GetArea, Draw {

    private double firstLeg;
    private double secondLeg;
    private double height;

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        if (firstLeg > 0) {
            this.firstLeg = firstLeg;
        }
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        if (secondLeg > 0) {
            this.secondLeg = secondLeg;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    @Override
    public double area() {
        return (firstLeg + secondLeg) * height / 2;
    }

    @Override
    public void print() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + area() + " sq. units, " + "FirstLeg: " + firstLeg + ", SecondLeg: " + secondLeg + ", Height: " + height + ", Color: " + getColor());
    }
}
