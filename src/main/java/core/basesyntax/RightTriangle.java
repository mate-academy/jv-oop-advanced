package core.basesyntax;

public final class RightTriangle extends Figure implements AreaCalculator, FigurePainter {
    private final float sideA; // first side of right triangle
    private final float sideB; // second side of right triangle
    // custom constructor for isosceles rectangle right triangle
    public RightTriangle(float sideA, float sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
        this.area = getArea();
        this.presentation = draw();
    }
    private final StringBuilder str = new StringBuilder("Figure: Right triangle, area: "); // draw right triangle presentation
    // area of square calculate as side a x side b / 2
    @Override
    public float getArea() {
        area = (sideA * sideB) / 2F;
        return area;
    }
    // draw means to print out all information about a figure using System.out.println().
    @Override
    public String draw() {
        str.append(area);
        str.append(" sq.units, side A: ");
        str.append(sideA);
        str.append(" units, side B: ");
        str.append(sideB);
        str.append(" units, color: ");
        str.append(color);
        return str.toString();
    }
}