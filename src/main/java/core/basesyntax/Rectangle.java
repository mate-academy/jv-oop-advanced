package core.basesyntax;

class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super("rectangle", color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String draw() {
        String figureDetails = "length: " + length + " unit, width: "
                + width + " unit, " + "color: " + getColor();

        // include additional information for draw()
        return super.draw() + "\n" + figureDetails;
    }
}
