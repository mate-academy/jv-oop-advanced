package core.basesyntax;

import java.util.Random;

public abstract class Figure implements CalculateArea, Drawable {

    private Random random = new Random();
    private Color color;
    private double area;

    private FigType type;

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

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public abstract Figure getRandomFigureSup();

    public abstract Figure getDefaultFigureSup();

    public abstract void draw();

    public abstract double getArea();

}







