package core.basesyntax;

public class Trapezoid extends Figure {
    private double upSide;
    private double downSide;
    private double height;

    public Trapezoid(FigureType figureType,
                     double upSide,
                     double downSide,
                     double height,
                     Color color) {
        super(figureType, color);
        this.upSide = upSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height / 2) * (upSide + downSide);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getFigureType()
                + ", area: " + getArea() + " sq.units, "
                + "upSide: " + upSide + " units, "
                + "downSide: " + downSide + " units, "
                + "height: " + height + " units, "
                + "color: " + super.getColor());
    }
}
