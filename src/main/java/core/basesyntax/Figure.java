package core.basesyntax;

public class Figure extends FigureSupplier implements Draw {
    public static final int FIGURE_COUNT = (int) (1 + (Math.random() * ((5 - 1) + 1)));
    private String color = getRandomColor();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {

    }
}
