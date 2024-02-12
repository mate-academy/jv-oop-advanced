package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private String color;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Name: rightTriangle, firstLeg: " + firstLeg + ", secondLeg: "
                + secondLeg + ", area: " + getFormat().format(getArea()) + ", color: " + color);
    }
}
