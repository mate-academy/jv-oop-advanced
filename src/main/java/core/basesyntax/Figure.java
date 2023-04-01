package core.basesyntax;

import java.util.Random;

public abstract class Figure implements FigureArea, FigureData, FigureColor {
    protected String color;
    protected double area;
    protected Random random = new Random();
}
