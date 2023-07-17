package core.basesyntax;

public class Rectangle extends Superclass {
    private final double width;
    private final double heigth;
    private final String color;

    public Rectangle(double width, double heigth, String color) {
        this.width = width;
        this.heigth = heigth;
        this.color = color;
    }

    @Override
    public String getArea() {
        return "\nFigure: rectangle, area: " + (width * heigth) + " sq.units, width: " + width
                + " units, heigth: " + heigth + " units, color: " + color;
    }
}
