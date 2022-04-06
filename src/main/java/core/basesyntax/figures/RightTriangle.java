package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        area();
    }

    @Override
    public void area() {
        area = 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, " + "area: " + area + " sq.units, " + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, " + "color: " + color);
    }
}