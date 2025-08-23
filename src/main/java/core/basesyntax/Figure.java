package core.basesyntax;

public abstract class Figure implements Drawable {
    private String name;
    private String color;

    public Figure(String color) {
        this.color = color;
        this.name = this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    @Override
    public abstract void draw();
}
