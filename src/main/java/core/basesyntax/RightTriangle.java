package core.basesyntax;

public class RightTriangle extends Figure {
    private String color = getColor();
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Figure: triangle, area: " + getArea() + " sq. units, first leg: "
                + firstLeg + " units, second leg: " + secondLeg + ", color: " + getColor());
    }

}
