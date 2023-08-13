package core.basesyntax;

class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s rectangle, first side: %.2f,"
                        + " second side: %.2f, area: %.2f",
                this.color, this.length, this.width, this.getArea()));
    }
}
