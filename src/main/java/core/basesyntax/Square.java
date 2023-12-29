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
    public long draw() {
        String figureDetails = "side: " + side + " unit, " + "color: " + getColor();

        System.out.println(super.draw());
        System.out.println(figureDetails);
        return 0;
    }
}
