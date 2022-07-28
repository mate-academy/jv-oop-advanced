package core.basesyntax;

public class Triangle implements Figure{
    private int side;
    private int height;
    private String color;

    public Triangle(int side, int height, String color) {
        this.side = side;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getDraw() {
        return "This is Triangle. I have Area: " + getArea() + "; side: " + side + "; height: " + height
                + "; and have color: " + getColor();
    }
}
