package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    Rectangle(String color,double firstLeg,double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String toString() {
        return "Rectangle: "
                + "firstLeg = " + firstLeg
                + ", secondLeg = " + secondLeg
                + ", color = " + getColor()
                + ", area = " + this.calculateArea();
    }
}
