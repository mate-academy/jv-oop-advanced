package core.basesyntax.figure;

import core.basesyntax.behaviour.FigureArea;
import core.basesyntax.behaviour.FigureDraw;
import core.basesyntax.tools.Color;
import java.util.Random;

public abstract class Figure implements FigureDraw, FigureArea {
    protected static final int MAX_SIDE_FIGURE = 14;
    private Color colorFigure;
    private String name;

    protected static int randomSideFigure() {
        return new Random().nextInt(MAX_SIDE_FIGURE) + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return colorFigure;
    }

    public void setColor(Color colorFigure) {
        this.colorFigure = colorFigure;
    }

    @Override
    public void draw() {
        System.out.print("figure: " + getName());
    }

    public abstract void randomFigure();

    @Override
    public void setArea(double area) {
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void resultArea() {
    }
}
