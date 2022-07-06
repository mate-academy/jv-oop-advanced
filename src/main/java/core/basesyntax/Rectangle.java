package core.basesyntax;

import static core.basesyntax.ColorSupplier.getRandomColor;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int GetArea() {
        return height * width;
    }

    @Override
    public String toDraw() {
        return "Figure: rectangle, area:" + GetArea()+
                "units , width: " + getWidth() +
                "units , height: " + getHeight() +
                "units, color:" + getRandomColor();
    }
}
