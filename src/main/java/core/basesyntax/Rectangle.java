package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(String color, double firstLeg, double secondLeg) {
        super(color);
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

    @Override
    public void draw() {
        if (getArea() == 0) {
            System.out.println(("Rectangle`s area is 0"));
        }
        System.out.println("Figure: rectangle " + "area: "
                + getArea() + " sq.units, " + " firstLeg: "
                + firstLeg + " units, " + " secondLeg "
                + secondLeg + " units,"
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        double area = firstLeg * secondLeg;
        return Math.round(area * 100) / 100;
    }
}
