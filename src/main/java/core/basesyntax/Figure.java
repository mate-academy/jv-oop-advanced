package core.basesyntax;

public abstract class Figure implements Area,Drawable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return ", area: " + getArea() + ", color: " + color;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
