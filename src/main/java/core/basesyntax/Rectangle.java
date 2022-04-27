package core.basesyntax;

public class Rectangle extends Figure implements GetArea, ToDraw {
    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Rectangle, area: " + this.getArea()
                + ", base: " + base + ", height: " + height + ", color: " + this.getColor());
    }
}
