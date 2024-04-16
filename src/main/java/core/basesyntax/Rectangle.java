package core.basesyntax;

class Rectangle extends AbstractFigure {
    private final double length;
    private final double width;
    private final String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println(getArea() + length + width + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
