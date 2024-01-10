package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.color = color;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle, area: "
                + getArea()
                + " firstLeg: "
                + firstLeg
                + ", secondLeg: "
                + secondLeg
                + ", color: "
                + color;
    }
}
