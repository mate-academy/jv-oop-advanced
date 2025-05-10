package core.basesyntax;

public class Square extends Figure implements GetFigureArea {
    private double side;

    public void draw() {
        System.out.println("Figure - Square: side " + this.side
                + " ,area " + this.getArea() + " color "
                + this.getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
    public Square(double side) {
        this.side = side;
    }
}
