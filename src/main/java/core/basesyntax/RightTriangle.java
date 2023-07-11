package core.basesyntax;

public class RightTriangle extends Figure{
    private int firstLeg;
    private int secondLeg;
    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "Right Triangle , area: " + getArea() +
                " sq.units," + "firstLeg: " + firstLeg + " units, " +
                "secondLeg: " + secondLeg + " units, " + "color: " + color);
        // Figure: triangle, area: 12.5 sq.units, firstLeg: 7 units, secondLeg: 5 units, color: yellow
    }
}
