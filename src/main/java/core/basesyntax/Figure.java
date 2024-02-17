package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: "
                + getArea() + " sq. units, color: " + color);
    }
}

