package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(String color, String figure, int firstLeg, int secondLeg) {
        super(color, figure);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure " + getType() + ", area " + getArea() + " sq.u., firstLeg "
                + firstLeg + "and secondLeg " + secondLeg + " u., color " + getColor();
    }
}
