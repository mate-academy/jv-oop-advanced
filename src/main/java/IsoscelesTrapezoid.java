public class IsoscelesTrapezoid extends Figure {
    private double upSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(String color, double upSide, double downSide, double height) {
        super(color);
        this.upSide = upSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + "sq.units, side 1: " + upSide
                + " units, side 2: " + downSide
                + " units, height: " + height
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (upSide + downSide) / 2 * height;
    }
}
