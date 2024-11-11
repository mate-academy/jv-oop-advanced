package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getS() {
        return Math.pow(this.side, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Квадрат { сторона = " + this.side + ", площа = "
                            + getS() + ", колір - " + getColor() + " }");
    }
}
