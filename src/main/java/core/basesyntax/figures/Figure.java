package core.basesyntax.figures;

import core.basesyntax.utils.CalculateArea;
import core.basesyntax.utils.Color;
import core.basesyntax.utils.DrawFigure;

public abstract class Figure implements DrawFigure, CalculateArea {
    private double area;
    private Color color;

    public Figure() {
    }

    public Figure(Color color) {
        this.color = color;
    }

    public Figure(double area, Color color) {
        this.area = area;
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public double calculate() {
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: figure, " + "area: " + area
                + " sq. units, " + "color: " + color.toString());
    }
}
