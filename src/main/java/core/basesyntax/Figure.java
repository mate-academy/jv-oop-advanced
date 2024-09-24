package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, properties: " + getProperties()
                + ", color: " + getColor());
    }

    protected abstract String getName();

    protected abstract String getProperties();

}
