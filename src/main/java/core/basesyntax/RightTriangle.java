package core.basesyntax;

public class RightTriangle extends Figure {
    private final int sideA;
    private final int sideB;

    public RightTriangle(int sideA, int sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public double getSquare() {
        return ((double) (getSideA() * getSideB()) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getClass().getSimpleName()
                + ", Area: " + getSquare()
                + ", sideA " + getSideA()
                + ", sideB " + getSideB()
                + ", Color: " + getColor());
    }
}
