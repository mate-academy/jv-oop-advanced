package core.basesyntax;

public class Rectangle extends Figure implements GetArea, Draw {

    private double width;
    private double height;

    public double getFirstLeg() {
        return width;
    }

    public void setFirstLeg(double firstLeg) {
        if (firstLeg > 0) {
            this.width = firstLeg;
        }
    }

    public double getSecondLeg() {
        return height;
    }

    public void setSecondLeg(double secondLeg) {
        if (secondLeg > 0) {
            this.height = secondLeg;
        }
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void print() {
        System.out.println("Figure: Rectangle, area: " + area() + " sq. units, " + "FirstLeg: " + width + ", SecondLeg: " + height + ", Color: " + getColor());
    }
}

