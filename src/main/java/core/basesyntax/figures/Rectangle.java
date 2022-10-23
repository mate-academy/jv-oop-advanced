package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Figure;
import core.basesyntax.FigureDraw;

public class Rectangle extends Figure implements FigureDraw, AreaCalculator {
    private final int width;
    private final int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Figure: "
                + Rectangle.class.getSimpleName()
                + ", area: "
                + getArea()
                + " sq.units, width: "
                + width
                + " units, height: "
                + height
                + " units, color: "
                + getColor();
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }
}
