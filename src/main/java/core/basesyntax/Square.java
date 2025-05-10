package core.basesyntax;

public class Square extends Figure {
    private double firstLeg;

    public Square(double firstLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * firstLeg;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: A " + firstLeg + " units, color: " + color);
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }
}
