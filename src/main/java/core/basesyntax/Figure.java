package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

}

/*public Figure(String color) {
        this.color = color;
    }

    public Figure(String color, int side) {
    }

    public abstract void draw();

    public abstract double getArea();

    public String getColor() {
        return color;*/
