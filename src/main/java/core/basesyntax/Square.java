package core.basesyntax;

public class Square extends Figure implements GetFigureArea {
    private double side;

    @Override
    public String toString() {
        return "Figure - Square: side " + this.side
                + " ,area " + this.getArea() + " color "
                + this.color;
    }

    @Override
    public double getArea() {
        return side * side;
    }
    public Square(double side) {
        this.side = side;
    }
}
