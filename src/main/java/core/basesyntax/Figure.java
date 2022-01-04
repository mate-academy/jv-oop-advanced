package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String type;
    private String color;

    public Figure(String color) {
        this.type = "Figure";
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract void draw();
}
