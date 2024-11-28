package core.basesyntax;

public class RightTriangle extends Figure {
    private int legA;
    private int legB;

    public RightTriangle(int legA, int legB, String color) {
        this.legA = legA;
        this.legB = legB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle, area: " + getArea() + " sq. units, legA: "
                + legA + " units, legB: " + legB + " units, color: " + color);
    }
}
