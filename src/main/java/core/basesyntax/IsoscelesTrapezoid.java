package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int sideA;
    private final int sideB;
    private final int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double getArea() {
        return ((double) (sideA + sideB) / 2) * 0.5;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getClass().getSimpleName()
                + ", Area: " + getArea()
                + ", sideA " + getSideA()
                + ", sideB " + getSideB()
                + ", height " + getHeight()
                + ", Color: " + getColor());
    }
}
