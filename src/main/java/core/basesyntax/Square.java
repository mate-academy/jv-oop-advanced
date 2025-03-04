package core.basesyntax;

public class Square extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Square(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: square, area: "
                + area()
                + "sq. units, firstLeg: "
                + firstLeg
                + " units, "
                + "secondLeg: "
                + secondLeg
                + " units, "
                + "color: "
                + getColor();
    }

    @Override
    public double area() {
        return (firstLeg * secondLeg) / 2;
    }
}
