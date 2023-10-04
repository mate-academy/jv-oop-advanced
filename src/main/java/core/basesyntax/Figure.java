package core.basesyntax;

import java.util.Random;

public abstract class Figure implements Drawable{
    public Random random = new Random();
    private Color color;
    private double area;

    private FigType type;

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

    public void setType(FigType type) {
        this.type = type;
    }

    public FigType getType() {
        return type;
    }

    public abstract Figure getRandomFigureSup();

    public abstract Figure getDefaultFigureSup();

    public abstract void draw();
}







