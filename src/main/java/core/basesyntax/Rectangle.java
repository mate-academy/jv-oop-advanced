package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        this.setName("rectangle");
        this.setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        String drawString = FIGURE + getName() + AREA
                + String.format("%.1f", getArea()) + SQ_UNITS
                + "firstSide: " + firstSide + UNITS
                + "secondSide: " + secondSide + UNITS
                + "color: " + getColor();
        System.out.println(drawString);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
