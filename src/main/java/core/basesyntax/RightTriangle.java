package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.setName("right triangle");
        this.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        String drawString = FIGURE + getName() + AREA
                + String.format("%.1f", getArea()) + SQ_UNITS
                + "firstLeg: " + firstLeg + UNITS
                + "secondLeg: " + secondLeg + UNITS
                + "color: " + getColor();
        System.out.println(drawString);
    }

    @Override
    public double getArea() {
        return (double) (firstLeg + secondLeg) / 2;
    }
}
