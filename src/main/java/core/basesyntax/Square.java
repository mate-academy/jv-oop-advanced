package core.basesyntax;

public class Square extends CommonValues {
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
        System.out.println("Figure: square, area: " + getArea() + "sq. units, "
                + "side: " + side + "units, color: " + color);
    }
}
