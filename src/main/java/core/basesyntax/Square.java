package core.basesyntax;

class Square extends Figure {
    private double side;

    public Square(double side, ColorSupplier.Color color) {
        super(color);
        this.side = side;
        setName("square");
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
