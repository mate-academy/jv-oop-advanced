package core.basesyntax;

public class Square extends Figure {
    private double sideOfSquare;

    public Square(Color color, double sideOfSquare) {
        super(color);
        this.sideOfSquare = sideOfSquare;
    }

    public double getSideOfSquare() {
        return sideOfSquare;
    }

    public void setSideOfSquare(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square," + "  area: " + gerArea() + " units," + " side: "
                + sideOfSquare + " units," + " color: " + getColor());
    }

    @Override
    public double gerArea() {
        return getSideOfSquare() * getSideOfSquare();
    }
}
