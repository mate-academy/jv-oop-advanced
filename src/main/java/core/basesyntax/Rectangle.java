package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        this.name = "rectangle";
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        String drawString = FIGURE + name + AREA
                + String.format("%.1f", getArea()) + SQ_UNITS
                + "firstSide: " + firstSide + UNITS
                + "secondSide: " + secondSide + UNITS
                + "color: " + color;
        System.out.println(drawString);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
