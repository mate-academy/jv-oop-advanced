package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    private String color;

    public Rectangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return (getFirstLeg() * getSecondLeg());
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.Rectangle.name() + ", area: "
                + Math.round(getArea() * 10.0) / 10.0 + " sq. units, firstLeg: "
                + Math.round(getFirstLeg() * 10.0) / 10.0 + " units, second leg: "
                + Math.round(getSecondLeg() * 10.0) / 10.0 + " units, color: "
                + getColor() + ".");
    }
}
