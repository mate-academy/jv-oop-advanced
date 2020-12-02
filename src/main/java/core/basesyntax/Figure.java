package core.basesyntax;

public abstract class Figure implements Draw {

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract String getName();

    public int getRadius() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public int getSide() {
        return 0;
    }
}
