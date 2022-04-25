package core.basesyntax.figure;

public class Triangle extends Figure{
    private  int firsLeg;
    private  int secondLeg;

    public Triangle(String color, int firsLeg, int secondLeg) {
        super(color);
        this.firsLeg = firsLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirsLeg() {
        return firsLeg;
    }

    public void setFirsLeg(int firsLeg) {
        this.firsLeg = firsLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firsLeg*secondLeg)/2;
    }

    @Override
    public void draw() {
        System.out.println("----------------------------"
                + "\n" + "Figure: right triangle"
                + "\n" + "Area: " + getArea() + " sq.units"
                + "\n" + "Side A: " + firsLeg + " units"
                + "\n" + "Side B: " + secondLeg + " units"
                + "\n" + "Color: " + getColor()
                + "\n" + "----------------------------" + "\n");
    }
}
