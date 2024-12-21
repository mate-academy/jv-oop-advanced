package core.basesyntax;

public abstract class Figure implements Calculable,Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract double area();

    @Override
    public abstract void draw();
}
