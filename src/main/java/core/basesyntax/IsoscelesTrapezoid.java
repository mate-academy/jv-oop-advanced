package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double lowSide;
    private final double topSide;
    private final double lateralSide;

    public IsoscelesTrapezoid(Color color, double lowSide, double topSide, double lateralSide) {
        super(color);
        this.lowSide = lowSide;
        this.topSide = topSide;
        this.lateralSide = lateralSide;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + Figures.RightTriangle.name()
                + ", area:" + getArea()
                + ", sq.units, low side:" + lowSide
                + ", units, top side: " + lowSide
                + ", units, lateral side: " + lateralSide
                + ", units, color: " + getColor());
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(Math.pow(lateralSide,2) - Math.pow(lowSide - lateralSide,2) / 4);
        return ((lowSide + topSide) / 2) / height;
    }
}
