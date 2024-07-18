package core.basesyntax;

public class Figure implements Drawable, Countable {
    private String color;
    private String name;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void draw() {
        System.out.println("Figure color: " + color + " name: " + name);
    }

    public double getArea() {
        return 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
