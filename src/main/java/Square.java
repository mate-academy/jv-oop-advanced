public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String printInfo() {
        return "Figure: square, area: " + calculateArea()
                + " sq.units, side: " + side
                + " units, color: " + super.getColor();
    }
}
