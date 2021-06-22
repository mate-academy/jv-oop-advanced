package core.basesyntax;

public abstract class Figure implements Drawing {
    private String name;
    private String color;

    public abstract String getName();

    public abstract String getColor();

    public abstract void setColor(String color);

    abstract double area();
}
