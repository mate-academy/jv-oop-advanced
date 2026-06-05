package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int sideX, int sideY, String color) {
        super(sideX, sideY, color);
        this.firstLeg = sideX;
        this.secondLeg = sideY;
    }

    public double area() {
        return Math.round(((double) (firstLeg * secondLeg) / 2) * 10) / 10.0;
    }

    public String draw() {
        return "Figure: right triangle, area: " + area()
                + " sq. units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + color;
    }
}
