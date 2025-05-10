package core.basesyntax;

public abstract class Figure implements Drawable, CalculateArea {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this);
    }
}
