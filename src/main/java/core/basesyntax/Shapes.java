package core.basesyntax;

public abstract class Shapes implements Draw {
    private String color;

    public Shapes(String color) {
        this.color = color;
    }

    abstract String figure();

    abstract void uniqueProperty();

}
