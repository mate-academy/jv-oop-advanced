package core.basesyntax;

class Square extends Figure {
    private final double side;
    private double diagonal;

    Square(double side, double diagonal, Color color) {
        super(color.name());
        this.side = side;
        this.setDiagonal(diagonal);
    }

    @Override
    public double area() {
        double s;
        s = (getDiagonal() * getDiagonal()) / 2;
        return s;
    }

    public double getSide() {
        return side;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + area()
                + " units, side: " + getSide() + " units, color: "
                + getColor();
    }
}
