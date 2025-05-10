package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int sides;
    private double height;
    private double area;

    public IsoscelesTrapezoid(Color color, int top, int bottom, int sides) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.sides = sides;
        this.height = Math.sqrt(Math.pow(sides, 2) - Math.pow((double) (bottom - top) / 2, 2));
        this.area = (top + bottom) * height / 2;;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid; Top side: " + top
                + " units; Bottom side: " + bottom
                + " units; Sides: " + sides
                + " units; Height: " + height
                + " units; Area: " + area
                + "sq. units; Color: "
                + super.getColor());
    }
}
