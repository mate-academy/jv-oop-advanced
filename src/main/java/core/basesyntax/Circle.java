package core.basesyntax;

public final class Circle extends Figure implements AreaCalculator, FigurePainter {
    private final float radius; // circle radius for area calculation
    // custom constructor for circle initialize
    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area = getArea();
        this.presentation = draw();
    }
    private final StringBuilder str = new StringBuilder("Figure: Circle, area: "); // draw circle presentation
    // area of circle calculate as 3,14 x radius * radius
    @Override
    public float getArea() {
        area = 3.14F * (radius * radius);
        return area;
    }
    // draw means to print out all information about a figure using System.out.println().
    @Override
    public String draw() {
        str.append(area);
        str.append(" sq.units, radius: ");
        str.append(radius);
        str.append(" units, color: ");
        str.append(color);
        return str.toString();
    }
}