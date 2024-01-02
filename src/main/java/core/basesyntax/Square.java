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
    public void draw() {
        String figureDetails = "side: " + side + " unit, " + "color: " + getColor();

        super.draw();
        System.out.println(figureDetails);
    }
}
