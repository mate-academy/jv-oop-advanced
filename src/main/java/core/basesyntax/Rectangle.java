package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstLeg() {
        return firstSide;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstSide = firstSide;
    }

    public int getSecondLeg() {
        return secondSide;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "rectangle, "
                + "area: " + calculateArea() + " sq.units, "
                + "firstSide: " + firstSide + " units, "
                + "secondSide: " + secondSide + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
