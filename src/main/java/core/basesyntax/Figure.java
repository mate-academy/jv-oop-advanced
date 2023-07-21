package core.basesyntax;

public abstract class Figure implements AreaFigure, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void draw() {
        System.out.println("Figure: " + getType() + ", area: "
                + area() + " sq.units, color: " + color);
    }

    public abstract String getType();
}
