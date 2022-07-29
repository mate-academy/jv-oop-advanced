package core.basesyntax.model;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle() {
    }

    public Rectangle(Color color) {
        super(color);
    }

    public Rectangle(Color color, int firstLeg, int secondLeg) {
        this(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea() + " sq.units, firstLeg = "
                + getFirstLeg() + " units, secondLeg = "
                + getSecondLeg() + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
