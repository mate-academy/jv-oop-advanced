package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq. units, sides length: "
                + sideA + " units, and " + sideB + " units, color: " + super.getColor());
    }

    @Override
    public double calculateArea() {
        return sideB * sideA / 2d;
    }
}
