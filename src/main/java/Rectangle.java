import java.util.Locale;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, FigureType figureType, int length, int width) {
        super(color,figureType);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: "
                + String.valueOf(getFigureType()).toLowerCase(Locale.ROOT) + "," + " area: "
                + Math.round(getArea() * 100.0) / 100.0 + " sq.units, "
                + " length: " + length + " units, "
                + " width: " + width + " units, "
                + " color: " + getColor());
    }
}
