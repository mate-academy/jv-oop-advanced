package core.basesyntax;

class Square extends Figure {
    private String name = "square";
    private String color;
    private double sideLength;

    public Square(String color) {
        this.color = color;
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public Square(String color, double sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double calculateFigureArea() {
        return this.sideLength * this.sideLength;
    }

    @Override
    public String getFigureInformation() {
        return "Figure: " + name + ", area: " + calculateFigureArea()
                + " sq. units, sideLength: " + sideLength
                + " units, color: " + color;
    }
}
