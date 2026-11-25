package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaCalculator {
    private double firstLeg;
    private double secondLeg;
    private double height;

    IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return height * ((firstLeg + secondLeg) / 2);
    }

    @Override
    public void drawable() {
        System.out.println("Figure:  Isosceles Trapezoid , area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg + ", secondLeg: " + secondLeg + ", height: " + height + " units, color: " + getColor());
    }


}
