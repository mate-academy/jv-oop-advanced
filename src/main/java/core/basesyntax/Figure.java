package core.basesyntax;

public abstract class Figure implements FindArea {
    private String color;
    private double area;

    public Figure() {
        color = new ColorSupplier().getRandomColor();
    }

    public Figure(String color) {
        this.color = color;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public abstract double getArea();

    public abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
