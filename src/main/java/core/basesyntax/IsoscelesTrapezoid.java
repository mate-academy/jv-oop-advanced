package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(String color,
                              double firstLeg,
                              double secondLeg,
                              double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSecondLeg() {
        return this.secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return this.firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return (this.firstLeg + this.secondLeg) * this.height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, firstLeg: "
                + this.firstLeg + " units, secondLeg: "
                + this.secondLeg + " units, height: "
                + this.height + " units, colors: " + getColor());
    }
}
