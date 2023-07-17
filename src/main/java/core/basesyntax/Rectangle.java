package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double heigth;
    private final String color;
    private final double areaRectangle;

    public Rectangle(double width, double heigth, String color) {
        super(color);
        this.width = width;
        this.heigth = heigth;
        this.color = color;
        this.areaRectangle = areaCalculator();
    }

    @Override
    public double areaCalculator() {
        return width * heigth;
    }

    @Override
    public String drawable() {
        return "\nFigure: rectangle, area: " + areaRectangle + " sq.units, width: " + width
                + " units, heigth: " + heigth + " units, color: " + color;
    }
}
