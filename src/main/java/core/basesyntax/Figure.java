package core.basesyntax;

public class Figure implements Draw {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String drawFigure() {
        return null;
    }
}
