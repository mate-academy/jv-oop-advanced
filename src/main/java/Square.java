import java.util.Locale;

public class Square extends Figure {
    private int side;

    public Square(String color, FigureType figureType, int side) {
        super(color,figureType);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: "
                + String.valueOf(getFigureType()).toLowerCase(Locale.ROOT) + ", "
                + " area: "
                + Math.round(getArea() * 100.0) / 100.0 + " sq.units, "
                + " side: " + side + " units, "
                + " color: " + getColor());
    }
}
