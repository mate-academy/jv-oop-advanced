package core.basesyntax.model;

public class Figure {
    private String name;
    private double area;
    private String color;

    public Figure(String name, double area, String color) {
        this.name = name;
        this.area = area;
        this.color = color;
    }

    public Figure() {

    }

    @Override
    public String toString() {
        return "Figure: "
                + "name = " + name
                + ", area = " + area
                + ", color = " + color;
    }
}
