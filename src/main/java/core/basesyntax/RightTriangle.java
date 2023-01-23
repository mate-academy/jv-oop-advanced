package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + area() + " units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return (double)(firstLeg * secondLeg) / 2;
    }
}
