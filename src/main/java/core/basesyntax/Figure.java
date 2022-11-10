package core.basesyntax;

public class Figure implements Getable,Drawable {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return 0;
    }
}
