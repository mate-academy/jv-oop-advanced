package core.basesyntax;

public class Rectangle extends Figure {
    private int lengh;
    private int width;

    public Rectangle(String color, int lengh, int width) {
        super(color);
        this.lengh = lengh;
        this.width = width;
    }

    @Override
    public double getArea() {
        return 1.0 * lengh * width;
    }

    private String getFigureName() {
        String figureFullName = this.getClass().getName();
        int lastIdx = figureFullName.lastIndexOf('.');
        return figureFullName.substring(lastIdx + 1);
    }

    @Override
    public String draw() {
        return "Drowing a " + getFigureName();
    }

    @Override
    public String toString() {
        return "Figure: " + getFigureName() + ", area: " + this.getArea()
                + " sq.units, lengh: " + lengh + ", width: " + width
                + " units, color: " + getColor();
    }
}
