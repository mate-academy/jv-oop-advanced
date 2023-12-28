package core.basesyntax;

class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super("square", color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String draw() {
        String figureDetails = "side: " + side + " unit, " + "color: " + getColor();

        // include additional information for draw()
        return super.draw() + "\n" + figureDetails;
    }
}
