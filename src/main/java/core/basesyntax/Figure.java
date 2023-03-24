package core.basesyntax;

import java.util.Random;

public abstract class Figure implements FigureArea, FigureData {
    protected String color;
    protected double area;
    protected String data;
    Random random = new Random();

    public String getColor() {
        return new ColorSupplier().getRandomColor();
    }
}
