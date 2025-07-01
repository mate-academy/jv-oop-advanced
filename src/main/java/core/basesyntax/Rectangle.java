package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculater {
    private double firstLeg;
    private double secondLeg;

    public Rectangle() {

    }

    public Rectangle(double a,double b) {
        this.firstLeg = a;
        this.secondLeg = b;
    }

    public Rectangle(String color,double a,double b) {
        setColor(color);
        this.firstLeg = a;
        this.secondLeg = b;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setFirstLeg(double a) {
        this.firstLeg = a;
    }

    public void setSecondLeg(double b) {
        this.secondLeg = b;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: "
                + getArea() + " sq. units, side 1: "
                + getFirstLeg() + " units, side 2:"
                + getSecondLeg() + " units," + " color: " + getColor();
    }
}
