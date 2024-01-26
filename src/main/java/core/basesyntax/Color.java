package core.basesyntax;

public class Color implements Figure{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return 0;
    }
}
