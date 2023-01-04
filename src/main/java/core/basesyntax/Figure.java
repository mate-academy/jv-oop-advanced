package core.basesyntax;

public abstract class Figure implements Printable, AreaCalculator {
    private String name;
    private String color;

    private double area;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void print() {
        System.out.print("Figure: " + name + ", " + "color: " + color + ", ");
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}
