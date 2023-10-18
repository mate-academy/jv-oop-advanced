package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg = 0;
    private double secondLeg = 0;

    RightTriangle() {
        super("right triangle", Color.WHITE);
    }

    RightTriangle(Color color) {
        super("right triangle", color);
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        if (firstLeg > 0) {
            this.firstLeg = firstLeg;
        } else {
            System.out.println("Triangle leg can't be negative or equal to zero!");
        }
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        if (secondLeg > 0) {
            this.secondLeg = secondLeg;
        } else {
            System.out.println("Triangle leg can't be negative or equal to zero!");
        }
    }

    public void setLegs(double firstLeg, double secondLeg) {
        if (firstLeg > 0 && secondLeg > 0) {
            this.firstLeg = firstLeg;
            this.secondLeg = secondLeg;
        } else {
            System.out.println("Triangle legs can't be negative or equal to zero!");
        }
    }

    @Override
    public double area() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        String info = "Figure: " + getName();
        info += ", area: " + area();
        info += " sq.units, firstLeg: " + firstLeg;
        info += " units, secondLeg: " + secondLeg;
        info += " units, color: " + getColor().name();
        System.out.println(info);
    }
}
