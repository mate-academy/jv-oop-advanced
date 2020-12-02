package core.basesyntax;

public abstract class Figure {

    private Color color;
    private int area;
    private String name;

    public abstract void draw();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public abstract String getName();

    public abstract void unicMetod();
}
