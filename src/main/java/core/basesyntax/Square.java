package core.basesyntax;

public class Square implements Figure {
    private double side;
    private String color;

    public Square(double side, String color) {
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
    public void draw() {
        System.out.println(String.format("Figure: square, area %.2f, "
                + "square side: %.2f, square color: %s",
                getArea(), side, color));
    }
}
