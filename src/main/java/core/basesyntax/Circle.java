package core.basesyntax;

public final class Circle extends Figure implements AreaCalculator, FigurePainter {
    private final float radius; // circle radius for area calculation
    private final StringBuilder str = new StringBuilder("Figure: Circle, area: ");

    // custom constructor for circle initialize
    public Circle(float radius, String color) {
        this.radius = radius;
        this.setColor(color);
        this.setPresentation(draw());
    }

    // area of circle calculate as 3,14 x radius * radius
    @Override
    public float getArea() {
        return 3.14F * (radius * radius);
    }

    // draw means to print out all information about a figure using System.out.println().
    @Override
    public String draw() {
        str.append(getArea());
        str.append(" sq.units, radius: ");
        str.append(radius);
        str.append(" units, color: ");
        str.append(getColor());
        return str.toString();
    }
}
