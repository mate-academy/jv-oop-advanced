package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double top;
    private double bot;

    IsoscelesTrapezoid(String color,double height, double top, double bot) {
        super(color);
        this.top = top;
        this.bot = bot;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (top + bot) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, top: "
                + top + " units, bottom: " + bot + " units, height: "
                + height + " units, color: " + getColor());
    }
}
