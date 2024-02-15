package core.basesyntax;

public class Square extends Figure {
    private int leg;

    public Square(int leg, String color) {
        this.leg = leg;
        setColor(color);
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }

    @Override
    public double calculateArea() {
        return (double) leg * leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " sq. units, leg: " + leg
                + " units, color: " + getColor());
    }
}
