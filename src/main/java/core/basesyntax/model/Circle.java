package core.basesyntax.model;

/**
 * @version 1.0
 * @autor shd
 * @created by 28/02/2022 - 13:02
 * @project jv-oop-advanced
 */
public class Circle extends Figure {
    private double radius;

    public Circle(String name, double area, Color colorFigure, double radius) {
        super(name, area, colorFigure);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Figure: " + name +
                ", area: " + area +
                " sq.units, radius: " + radius +
                " units, color: " + colorFigure;
    }
}
