package core.basesyntax;

public class Figure implements Draw {
    private Colors color;

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
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
