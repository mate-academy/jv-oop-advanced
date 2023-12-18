package core.basesyntax;

class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public String draw() {
        return "length: " + length + " unit, width: " + width + " unit, " + "color: " + getColor();
    }
}
