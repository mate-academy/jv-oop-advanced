package core.basesyntax;

class Square extends Figure {

    private double length;

    public Square(double length, Colors color) {
        super(color);
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, Length: " + length + LENGTH_UNITS
                + ", Area: " + getArea() + AREA_UNITS
                + ", Color: " + color.name());
    }

    @Override
    public double getArea() {
        double squarearea = length * length;
        return squarearea;
    }
}
