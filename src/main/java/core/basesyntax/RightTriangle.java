package core.basesyntax;

public class RightTriangle extends Figure {
    private int legTriangleA;
    private int legTriangleB;

    public RightTriangle(int legTriangleA, int legTriangleB, String color, String nameFigure) {
        super(color, nameFigure);
        this.legTriangleA = legTriangleA;
        this.legTriangleB = legTriangleB;
    }

    public int getLegTriangleA() {
        return legTriangleA;
    }

    public void setLegTriangleA(int legTriangleA) {
        this.legTriangleA = legTriangleA;
    }

    public int getLegTriangleB() {
        return legTriangleB;
    }

    public void setLegTriangleB(int legTriangleB) {
        this.legTriangleB = legTriangleB;
    }

    public double getHypotenuse() {
        return Math.sqrt(this.legTriangleA * this.legTriangleA
                + this.legTriangleB * this.legTriangleB);
    }

    @Override
    public double getArea() {
        return (this.legTriangleA * this.legTriangleB) / (double) 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameFigures() + ", area: " + getArea()
                + " sq. units, hypotenuse: " + getHypotenuse()
                + " units, color: " + getColor());
    }
}
