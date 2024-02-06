package core.basesyntax;

class IsoscelesTrapezoid extends Figure implements FigureArea {
    public final static String name = "isosceles trapezoid";
    private String color;
    private double firstSideLength;
    private double secondSideLength;

    public IsoscelesTrapezoid(String color) {
        this.color = color;
    }

    public IsoscelesTrapezoid(double firstSideLength, double secondSideLength) {
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    public IsoscelesTrapezoid(String color, double firstSideLength, double secondSideLength) {
        this.color = color;
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    public String getColor() {
        return color;
    }

    public double getFirstSideLength() {
        return firstSideLength;
    }

    public double getSecondSideLength() {
        return secondSideLength;
    }

    @Override
    public double calculateFigureArea() {
        return this.firstSideLength * this.secondSideLength;
    }

    @Override
    public String getFigureInformation() {
        return "Figure: " + name + ", area: " + calculateFigureArea()
                + " sq. units, firstSideLength: "
                + firstSideLength + " units, secondSideLength: "
                + secondSideLength + " units, color: " + color;
    }
}
