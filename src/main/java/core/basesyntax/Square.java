package core.basesyntax;

public final class Square extends Figure implements AreaCalculator, FigurePainter {
    private final float side; // first and second side of square
    // custom constructor for isosceles rectangle right triangle
    public Square(float side, String color) {
        this.side = side;
        this.color = color;
        this.area = getArea();
        this.presentation = draw();
    }
    private final StringBuilder str = new StringBuilder("Figure: Square, area: "); // draw square presentation
    // area of square calculate as side x side
    @Override
    public float getArea() {
        area = side * side;
        return area;
    }
    // draw means to print out all information about a figure using System.out.println().
    @Override
    public String draw() {
        str.append(area);
        str.append(" sq.units, side: ");
        str.append(side);
        str.append(" units, color: ");
        str.append(color);
        return str.toString();
    }
}