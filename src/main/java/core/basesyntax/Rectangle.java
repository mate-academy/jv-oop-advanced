package core.basesyntax;

public class Rectangle extends Figure {
    private int oneSide;
    private int secondSide;

    public Rectangle(Color color, int oneSide, int secondSide) {
        this.setColor(color);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
    }

    public String draw() {
        return "Figure: rectangle, area: " + calculateArea() + " sq. units,"
                + " oneSide: " + oneSide + " units,"
                + " secondSide: " + secondSide + " units,"
                + " color: " + getColor();
    }

    @Override
    public double calculateArea() {
        return oneSide * secondSide;
    }
}
