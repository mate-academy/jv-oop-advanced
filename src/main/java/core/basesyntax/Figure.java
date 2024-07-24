package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;
    private String name;
    private double figureArea = getArea();

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
        this.figureArea = area;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Figure name: " + name + " color: " + color + " area: " + figureArea);
    }
}
