package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawer {
    private String color;
    private String name;

    Figure(String name) {
        this.color = ColorSupplier.colorGen();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
