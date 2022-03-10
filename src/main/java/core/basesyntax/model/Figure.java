package core.basesyntax.model;

/**
 * @version 1.0
 * @autor shd
 * @created by 28/02/2022 - 12:45
 * @project jv-oop-advanced
 */
public abstract class Figure {
    protected String name;
    protected double area;
    protected Color colorFigure;

    public Figure(String name, double area, Color colorFigure) {
        this.name = name;
        this.area = area;
        this.colorFigure = colorFigure;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + area + "sq.units, color: " + colorFigure;
    }
}
