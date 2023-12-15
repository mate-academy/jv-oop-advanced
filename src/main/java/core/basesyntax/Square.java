package core.basesyntax;

class Square extends Figure {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getArea() {
        return side * side;
    }

    public String getName() {
        return "square";
    }

    public String getInfo() {
        return "side: " + side + " unit, " + "color: " + color;
    }
}


