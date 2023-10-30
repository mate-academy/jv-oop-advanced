package core.basesyntax;

public class RightTriangle extends Figure {
    private int legA;
    private int legB;

    public RightTriangle(String color, int legA, int legB) {
        super(color);
        this.legA = legA;
        this.legB = legB;
    }

    @Override
    public void draw() {
        System.out.println("The " + getColor() + " right rectangle has length of leg A - " + legA
                + ", leng of leg B - " + legB + " and an area of " + getArea());
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }
}
