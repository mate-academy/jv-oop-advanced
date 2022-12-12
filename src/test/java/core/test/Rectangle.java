package core.test;

public class Rectangle extends Figure{
    private int firstLeg;
    private int secondLeg;
    public Rectangle(int firstLeg, int secondLeg) {
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
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
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " unit, color: " + getColor());
    }
}
