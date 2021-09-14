package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, side: " + side + " units, color: " + getRandomColor();
    }
}





