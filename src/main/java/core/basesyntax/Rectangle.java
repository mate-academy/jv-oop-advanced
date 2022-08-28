package core.basesyntax;

public class Rectangle extends Figure {
    private int lengh;
    private int width;

    public Rectangle(String color, int lengh, int width) {
        super(color);
        setFigureType(FigureTypeName.rectangle.toString());
        this.lengh = lengh;
        this.width = width;
    }

    @Override
    public double area() {
        return 1.0 * lengh * width;
    }

    @Override
    public String drow() {
        return "Drowing a " + getFigureType();
    }

    @Override
    public String toString() {
        return "Figure: " + getFigureType() + ", area: " + area() + " sq.units"
                + ", lengh: " + lengh + ", width: " + width + " units, color: "
                + getColor();
    }
}
