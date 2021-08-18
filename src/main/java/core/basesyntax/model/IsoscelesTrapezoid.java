package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;
    private int diagonal;
    private int height;

    public IsoscelesTrapezoid(String figureColor,
                              int sideA, int sideB,
                              int sideC, int diagonal,
                              int height) {
        super(figureColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.diagonal = diagonal;
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid"
                + ", area: " + getArea() + " sq.units"
                + ", side a: " + sideA
                + ", side b: " + sideB
                + ", side c: " + sideC
                + ", diagonal: " + diagonal
                + ", height: " + height
                + ", color: " + getColor());
    }
}
