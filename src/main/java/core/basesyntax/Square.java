package core.basesyntax;

public final class Square extends Figure implements AreaCalculator, FigurePainter {
    private final float side; // first and second side of square
    private final StringBuilder str = new StringBuilder("Figure: Square, area: ");

    // custom constructor for isosceles rectangle right triangle
    public Square(float side, String color) {
        this.side = side;
        this.setColor(color);
        this.setPresentation(draw());
    }

    // area of square calculate as side x side
    @Override
    public float getArea() {
        return side * side;
    }

    // draw means to print out all information about a figure using System.out.println().
    @Override
    public String draw() {
        str.append(getArea());
        str.append(" sq.units, side: ");
        str.append(side);
        str.append(" units, color: ");
        str.append(getColor());
        return str.toString();
    }
}
