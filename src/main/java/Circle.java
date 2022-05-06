import java.util.Locale;

public class Circle extends Figure {
    private double radius;

    public Circle(String color,FigureType figureType, double radius) {
        super(color,figureType);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: "
                + String.valueOf(getFigureType()).toLowerCase(Locale.ROOT)
                + "," + " area: "
                + Math.round(getArea() * 100.0) / 100.0 + " sq.units,"
                + " radius: " + radius + " units," + " color: " + getColor());
    }
}
