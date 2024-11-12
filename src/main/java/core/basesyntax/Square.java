package core.basesyntax;

class Square extends Figure {
    private double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Square [color=" +
                color + ", sideLength=" +
                sideLength + ", area=" +
                getArea() + "]");
    }
}
