package core.basesyntax;

public abstract class Figure implements IShape {
    private String color;
    private String name;

    public String getColor() {
        return color;
    }

    @Override
    public abstract void draw();

    @Override
    public abstract double getArea();

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
}
