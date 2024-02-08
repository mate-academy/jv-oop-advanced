package core.basesyntax;

class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.length = height;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq. units, length: "
                + length + " units, width: " + width + " units, color: " + color);
    }
}
