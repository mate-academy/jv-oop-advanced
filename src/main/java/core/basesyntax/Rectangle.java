package core.basesyntax;

public class Rectangle extends Figure implements Draw, Area{
    private double firstLeg;
    private double secondLeg;

    public Rectangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle, " + "square=" + getArea() +", firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg + ", color=" + getColor() + '.';
    }
}
