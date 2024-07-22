package core.basesyntax;

public class Figure implements Drawable, AreaCalculator {
    private String color;
    private String name;
    private double area = getArea();

    public Figure() {

    }

    public Figure(String color) {
        this.color = color;
    }

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Figure(String color, String name, double area) {
        this.color = color;
        this.name = name;
        this.area = area;
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

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Figure name: " + name + " color: " + color + " area: " + getArea());
    }
}
