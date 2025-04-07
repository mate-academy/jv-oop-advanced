package core.basesyntax.figures;

public class Figure implements Drawable, Calculateble {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void draw() {
        System.out.println("draw figure");
    }

    @Override
    public double area() {
        return 0;
    }
}
