package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    //public abstract double area();
    //public abstract void draw();

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
