package core.basesyntax;

public class RightTriangle extends Figure {
    public static final double CONSTANT = 0.5;
    private double bisector;
    private double side;

    public RightTriangle(Colors color, Figures typeOfFigure, double side, double bisector) {
        super(color, typeOfFigure);
        this.side = side;
        this.bisector = bisector;
    }

    @Override
    public double getSquare() {
        return side * bisector * CONSTANT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeOfFigure() + ", area: " + getSquare()
                + " sq.units, side: " + side + " units, bisector: " + bisector + " units, color: "
                + getColor());
    }
}

