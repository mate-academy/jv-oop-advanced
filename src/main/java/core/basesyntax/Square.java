package core.basesyntax;

class Square extends ColorsOfFigures {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getToDraw() {
        System.out.println("side: " + side);
    }
}
