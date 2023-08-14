package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        super.color = color;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Square, Area: " + this.getArea()
                + "Side: " + this.side + " color:" + super.color);
    }
}
