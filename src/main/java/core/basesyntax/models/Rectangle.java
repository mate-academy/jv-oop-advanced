package core.basesyntax.models;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String draw() {
        return this.toString();
    }

    @Override
    public double obtainArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width: "
                + width + " units, height: "
                + height + " units, color: "
                + getColor();
    }
}
