package core.basesyntax;

public abstract class Figure implements Area,Drawable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(", area: " + area() + ", color: " + color);
    }

    @Override
    public double area() {
        return 0;
    }
}
