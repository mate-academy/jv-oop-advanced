package core.basesyntax;

public class RightTriangle extends Figure {
    private Color color;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        String line = "Figure: RightTriangle, area: ";
        System.out.println(line + area() + ", 1: " + firstLeg + ", 2: " + secondLeg + ", color: " + color);
    }

    @Override
    public double area() {
        return firstLeg * secondLeg / 2;
    }
}
