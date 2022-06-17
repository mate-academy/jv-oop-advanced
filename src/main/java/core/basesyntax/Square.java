package core.basesyntax;

public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void getInfoAboutFigure() {
        System.out.println("Figure: square, area: " + (side * side)
                + ", side: " + side
                + " color: " + getColor());
    }

}
