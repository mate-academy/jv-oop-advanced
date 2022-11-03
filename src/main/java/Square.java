public class Square extends Figure implements AreaCalculator, FigureInformation {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public String draw() {
        return ("Figure: square, area: " + getArea() + " sg.units, side: " + side
                + " units, color: " + color);
    }
}
