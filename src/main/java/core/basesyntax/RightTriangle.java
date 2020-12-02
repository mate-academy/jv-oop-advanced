package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Draw right triangle");
    }

    @Override
    public double getArea() {
        return (sideA * sideB) / 2;
    }

    @Override
    public String getName() {
        return "Right triangle";
    }

    @Override
    public int getSide() {
        return sideA;
    }
}
