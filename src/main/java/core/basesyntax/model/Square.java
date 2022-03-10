package core.basesyntax.model;

/**
 * @version 1.0
 * @autor shd
 * @created by 28/02/2022 - 13:18
 * @project jv-oop-advanced
 */
public class Square extends Figure {
    private double side;

    public Square(String name, double area, Color colorFigure, double side) {
        super(name, area, colorFigure);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Figure: " + name
                + ", area: " + area
                + " sq.units, side: " + side
                + " units, color: " + colorFigure;
    }
}
