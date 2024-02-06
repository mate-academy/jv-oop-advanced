package core.basesyntax;

class Rectangle extends Figure implements FigureArea {

    public final static String name = "rectangle";
    private String color;
    private double firstSideLength;
    private double secondSideLength;

    public Rectangle(String color) {
        this.color = color;
    }

    public Rectangle(double fistSideLength, double secondSideLength) {
        this.firstSideLength = fistSideLength;
        this.secondSideLength = secondSideLength;
    }

    public Rectangle(String color, double fistSideLength, double secondSideLength) {
        this.color = color;
        this.firstSideLength = fistSideLength;
        this.secondSideLength = secondSideLength;
    }

    public String getColor() {
        return color;
    }

    public double getFistSideLength() {
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
