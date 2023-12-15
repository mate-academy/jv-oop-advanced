package core.basesyntax;

class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        setColor(color);
    }

    public double calculateArea() {
        return side * side;
    }

    public String getName() {
        return "square";
    }

    public String draw() {
        return "side: " + side + " unit, " + "color: " + getColor();
    }
}
