package core.basesyntax;

class Square extends Figure {
    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    private double side;

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, Color:" + color + ", Side: " + side + ", Area:" + area());

    }
}
