package core.basesyntax;

public class RightTriangle extends Figure {
    private final int sideA;
    private final int sideB;

    public RightTriangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure:"
                + " right triangle,"
                + " area: " + getArea()
                + " sideA: " + sideA
                + " sideB: " + sideB
                + " ,color: " + color
        );
    }

    @Override
    public int getArea() {
        return (this.sideA * this.sideB) / 2;
    }

}
