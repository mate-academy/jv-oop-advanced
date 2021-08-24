package core.basesyntax;

public final class IsoscelesTrapezoid extends Figure implements AreaCalculator, FigurePainter {
    private final float sideDown; // isosceles trapezoid down part
    private final float sideUp; // isosceles trapezoid up part
    private final float height; // isosceles trapezoid height
    private final StringBuilder str = new StringBuilder("Figure: Isosceles Trapezoid, area: ");

    // custom constructor for isosceles trapezoid initialize
    public IsoscelesTrapezoid(float sideDown, float sideUp, float height, String color) {
        this.sideDown = sideDown;
        this.sideUp = sideUp;
        this.height = height;
        this.setColor(color);
        this.setPresentation(draw());
    }

    // area of isosceles trapezoid calculate as (sideDown + sideUp) / 2 * height;
    @Override
    public float getArea() {
        return (sideUp + sideUp) / 2 * height;
    }

    // draw means to print out all information about a figure using System.out.println().
    @Override
    public String draw() {
        str.append(getArea());
        str.append(" sq.units, side Down: ");
        str.append(sideDown);
        str.append(" units, side Up: ");
        str.append(sideUp);
        str.append(" units, height: ");
        str.append(height);
        str.append(" units, color: ");
        str.append(getColor());
        return str.toString();
    }
}
