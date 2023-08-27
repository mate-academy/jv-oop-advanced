package core.basesyntax;

public abstract class Figure implements Drawable {
    private String color;

    public Figure() {
        color = "WHITE";
    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println();
    }

    public double area() {
        return 0;
    }
}
