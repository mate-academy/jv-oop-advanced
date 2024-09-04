package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setColor(color);
    }

    private double calculateAndSetArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle, area: " + calculateAndSetArea()
                + " sq. units, firstSide: " + firstSide + " units, secondSide: "
                + secondSide + " units, color: " + getColor();
    }
}
