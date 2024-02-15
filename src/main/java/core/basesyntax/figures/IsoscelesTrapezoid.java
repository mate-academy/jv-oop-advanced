package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double bottom;
    private double top;
    private double height;
    private double side;

    public IsoscelesTrapezoid(String color, double bottom, double top, double side) {
        super(color);
        this.bottom = bottom;
        this.top = top;
        if (bottom < top) {
            double temp = bottom;
            this.bottom = this.top;
            this.top = temp;
        }
        this.height = Math.sqrt(Math.pow(top, 2) - Math.pow((bottom - side), 2) / 4);;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + area()
                + "sq. units, first side: " + bottom + "units, second side: "
                + top + "units, lateral side:  " + side + "units, color: "
                + color);
    }

    @Override
    public double area() {
        return (bottom + top) * 0.5 * height;
    }
}
