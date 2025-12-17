package core.basesyntax;

public abstract class Figure implements AreaCalculable, Parameterizable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: "
                + String.format("%.2f", getArea()) + " sq. units, " + getParameters()
                + ", color: " + color);
    }
}
