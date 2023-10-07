package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public void printfInfoAboutFigure() {
        System.out.println("Figure: rectangle, area: " + length * width + " sq.units, length: "
                + length + " sq.units, width: " + width + " units, color: " + getColor());
    }
}
