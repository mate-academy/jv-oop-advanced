package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawer {
    private ColorSupplier cs = new ColorSupplier();
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return cs.getRandomColor();
    }
}
