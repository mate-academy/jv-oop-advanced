package core.basesyntax;

class Square extends AbstractFigure {
    private String color;
    private double side;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(getArea() + side + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
