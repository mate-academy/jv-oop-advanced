package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double height;

    IsoscelesTrapezoid(String color,double firstLeg, double secondLeg,double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((firstLeg + secondLeg) / 2) * height;
    }

    @Override
    public String toString() {
        return "Isosceles Trapezoid: "
                + "firstLeg = " + firstLeg
                + ", secondLeg = " + secondLeg
                + ", height = " + height
                + ", color = " + getColor()
                + ", area = " + this.calculateArea();
    }
}
