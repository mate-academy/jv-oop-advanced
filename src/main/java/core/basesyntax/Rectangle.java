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
    public long draw() {
        String figureDetails = "length: " + length + " unit, width: "
                + width + " unit, " + "color: " + getColor();

        System.out.println(super.draw());
        System.out.println(figureDetails);
        return 0;
    }
}
