package core.basesyntax.figure;

import core.basesyntax.behaviour.FigureCreation;
import core.basesyntax.behaviour.FigureDraw;
import core.basesyntax.tools.Color;
import java.util.Random;

public abstract class Figure implements FigureDraw, FigureCreation {
    protected static final int MAX_SIDE_FIGURE = 14;
    private Color colorFigure;
    private String name;
    private double area;

    protected static int randomSideFigure() {
        return new Random().nextInt(MAX_SIDE_FIGURE) + 1;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {

        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return colorFigure.toString();
    }

    public void setColor(Color colorFigure) {
        this.colorFigure = colorFigure;
    }

    @Override
    public void draw() {
        System.out.print("figure: " + getName() + " area: " + area + " sq.units");
    }

    @Override
    public void randomFigure() {
        int randomColorCircle = new Random().nextInt(Color.values().length);
        setColor(Color.values()[randomColorCircle]);
    }

    public abstract void resultArea();
}
