package core.basesyntax;

public abstract class Shape implements Drawable, AreaCalculator {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract String figure();

    abstract void uniqueProperty();

}
