package core.basesyntax;

class Rectangle extends ColorsOfFigures {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void getToDraw() {
        System.out.println("length: " + length + ", width: " + width);
    }
}
