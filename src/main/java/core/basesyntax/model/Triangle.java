package core.basesyntax.model;

/**
 * @version 1.0
 * @autor shd
 * @created by 28/02/2022 - 13:18
 * @project jv-oop-advanced
 */
public class Triangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Triangle(String name, double area, Color colorFigure, int firstLeg, int secondLeg) {
        super(name, area, colorFigure);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: " + name +
                ", area: " + area +
                " sq.units, firstLeg: " + firstLeg +
                " units, secondLeg: " + secondLeg +
                " units, color: " + colorFigure;
    }
}
