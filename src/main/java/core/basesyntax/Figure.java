package core.basesyntax;

public abstract class Figure implements AreaCalculable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public abstract void getArea();

    public String getColor() {
        return color;
    }

    public abstract void draw();
}
