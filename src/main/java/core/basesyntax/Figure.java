package core.basesyntax;

public abstract class Figure implements AreaCalculation,Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void draw() {
    }
}
