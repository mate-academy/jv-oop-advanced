package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, Colors colors) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(colors);
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double calculateArea() {
        return getSecondLeg() * getFirstLeg();
    }

    @Override
    public void draw() {
        System.out.println("Rectangle, area is " + calculateArea() + " sq. units, "
                + "first leg: " + getFirstLeg() + " units, "
                + "second leg: " + getSecondLeg() + " units, "
                + "color: " + getColor());
    }
}
