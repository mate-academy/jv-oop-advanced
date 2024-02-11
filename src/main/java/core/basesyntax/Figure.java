package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                + ", area: " + this.getArea() + " sq. units, color: " + this.getColor());
    }
}
