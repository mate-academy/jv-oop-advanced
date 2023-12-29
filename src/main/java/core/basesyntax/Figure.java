package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {

    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public long draw() {
        System.out.println("Drawing " + getName() + " with color " + getColor() + "...");
        return 0;
    }
}
