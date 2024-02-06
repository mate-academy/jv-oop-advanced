package core.basesyntax;

class RightTriangle extends Figure implements FigureArea {

    public final static String name = "right triangle";
    private String color;
    private double sideLength;

    public RightTriangle(String color) {
        this.color = color;
    }

    public RightTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    public RightTriangle(String color, double sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }

    public String getColor() {
        return color;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double calculateFigureArea() {
        return (Math.pow(this.sideLength, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public String getFigureInformation() {
        return "Figure: " + name + ", area: " + calculateFigureArea()
                + " sq. units, sideLength: " + sideLength
                + " units, color: " + color;
    }
}
