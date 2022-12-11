package core.basesyntax;

import java.util.Random;

public abstract class Figure implements FigureInformation, FigureArea {
    protected Random random = new Random();
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract void draw();
}
