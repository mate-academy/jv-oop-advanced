package core.basesyntax;

class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        super(Square.class.getSimpleName(), color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        String figureDetails = "side: " + side + " unit, " + "color: " + getColor();

        super.draw();
        System.out.println("figure: " + getName() + ", square: "
                + calculateArea() + " sq.units.");
        System.out.println(figureDetails);
    }
}
