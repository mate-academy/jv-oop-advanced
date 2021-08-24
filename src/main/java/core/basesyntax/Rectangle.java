package core.basesyntax;

public final class Rectangle extends Figure implements AreaCalculator, FigurePainter {
    private final float sideA; // first side of rectangle
    private final float sideB; // second side of rectangle
    // custom constructor for isosceles rectangle initialize
    public Rectangle(float sideA, float sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
        this.area = getArea();
        this.presentation = draw();
    }
    private final StringBuilder str = new StringBuilder("Figure: Rectangle, area: "); // draw rectangle presentation
    // area of rectangle calculate as sideA x side b
    @Override
    public float getArea() {
        area = sideA * sideB;
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