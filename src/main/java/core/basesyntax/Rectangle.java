package core.basesyntax;

class Rectangle extends Figure {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double getArea() {
        return length * width;
    }

    public String getName() {
        return "rectangle";
    }

    public String getInfo() {
        return "length: " + length + " unit, width: " + width + " unit, " + "color: " + color;
    }
}
