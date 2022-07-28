package core.basesyntax;

public class Square extends Color {
    private int side;
    private String color;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getDraw() {
        return "This is Square. I have Area: " + getArea() + "; side: " + side
                + "; and have color: " + getColor();
    }
}
