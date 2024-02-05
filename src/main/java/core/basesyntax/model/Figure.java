package core.basesyntax.model;

public class Figure implements Drawable, FigureArea {
    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "name = " + name
                + ", color = " + color);
    }

    @Override
    public double area() {
        return 0;
    }
}
