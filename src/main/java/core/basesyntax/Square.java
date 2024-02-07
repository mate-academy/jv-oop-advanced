package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String name() {
        return String.valueOf(Figures.SQUARE);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name()
                + ", area: " + getArea()
                + ", side: " + side
                + ", color: " + getColor());
    }
}
