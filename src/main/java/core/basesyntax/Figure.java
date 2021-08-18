package core.basesyntax;

public class Figure extends FigureSupplier implements Draw {
    private String color;

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
