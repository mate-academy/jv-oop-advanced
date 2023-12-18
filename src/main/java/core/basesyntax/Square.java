package core.basesyntax;

class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public String draw() {
        return "side: " + side + " unit, " + "color: " + getColor();
    }
}
