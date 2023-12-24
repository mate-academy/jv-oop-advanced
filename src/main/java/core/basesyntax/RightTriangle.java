package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.name = "right triangle";
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        String drawString = FIGURE + name + AREA
                + String.format("%.1f", getArea()) + SQ_UNITS
                + "firstLeg: " + firstLeg + UNITS
                + "secondLeg: " + secondLeg + UNITS
                + "color: " + color;
        System.out.println(drawString);
    }

    @Override
    public double getArea() {
        return (double) (firstLeg + secondLeg) / 2;
    }
}
