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
    public void draw() {
        System.out.println(String.format("Figure: %s square, side: %.2f, area: %.2f",
                this.color, this.side, this.getArea()));
    }

}
