package core.basesyntax;

public class Square extends ColorFigure {
    private String color;
    private double side;

    public Square(String colo, double sider) {
        super(colo);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawable: square, area: " + getArea()
                + " side: " + side
                + " color: " + getColor());
    }
}
