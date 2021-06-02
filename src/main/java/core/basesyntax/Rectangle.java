package core.basesyntax;

public class Rectangle extends Figure {
    private int side;
    private int leg;

    public Rectangle(String color, int side, int leg) {
        super(color);
        this.side = side;
        this.leg = leg;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public double areaCalculator() {
        return (double) (side * leg);
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + this.areaCalculator()
                + " sq.units, side: "
                + this.getSide()
                + " units, leg: "
                + this.getLeg()
                + " units, color: "
                + this.getColor());
    }
}
