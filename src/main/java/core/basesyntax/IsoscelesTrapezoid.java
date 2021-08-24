package core.basesyntax;

public final class IsoscelesTrapezoid extends Figure implements AreaCalculator, FigurePainter {
    private final float sideDown; // isosceles trapezoid down part
    private final float sideUp; // isosceles trapezoid up part
    private final float height; // isosceles trapezoid height
    // custom constructor for isosceles trapezoid initialize
    public IsoscelesTrapezoid(float sideDown, float sideUp, float height, String color) {
        this.sideDown = sideDown;
        this.sideUp = sideUp;
        this.height = height;
        this.color = color;
        this.area = getArea();
        this.presentation = draw();
    }
    private final StringBuilder str = new StringBuilder("Figure: Isosceles Trapezoid, area: "); // draw isosceles trapezoid presentation
    // area of isosceles trapezoid calculate as (sideDown + sideUp) / 2 * height;
    @Override
    public float getArea() {
        area = (sideUp + sideUp) / 2 * height;
        return area;
    }
    // draw means to print out all information about a figure using System.out.println().
    @Override
    public String draw() {
        str.append(area);
        str.append(" sq.units, side Down: ");
        str.append(sideDown);
        str.append(" units, side Up: ");
        str.append(sideUp);
        str.append(" units, height: ");
        str.append(height);
        str.append(" units, color: " );
        str.append(color);
        return str.toString();
    }
}