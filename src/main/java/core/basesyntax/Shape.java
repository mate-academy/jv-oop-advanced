package core.basesyntax;

public class Shape implements AreaCounter {
    private float area;
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public float getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public float countArea() {
        return 0;
    }
}
