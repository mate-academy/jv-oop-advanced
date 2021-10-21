package core.basesyntax;

public class Shape {
    private String shapeName;
    private float area;
    private String color;

    public Shape(String shapeName, String color) {
        this.shapeName = shapeName;
        this.color = color;
    }

    public float getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
