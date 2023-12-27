package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {

    private String name;
    private ColorSupplier.Color color;

    public Figure(ColorSupplier.Color color) {
        this.color = color;
    }

    public ColorSupplier.Color getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String draw() {
        return "Drawing " + getName() + " with color " + getColor() + "...";
    }
}
