package core.basesyntax;

public class Shape implements AreaCounter,Drawable {
    private float area;
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void setArea(float area) {
       this.area = countArea();
    }

    public float getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    @Override
    public float countArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Unknown shape, Color " + color + ", area" + area);
    }
}
