package core.basesyntax;

class Square extends Figure {
    private final double side;
    private double diagonal;
    private Color color;

    Square(double side, double diagonal, Color color) {
        name = "Square";
        this.setColor(color);
        this.side = side;
        this.setDiagonal(diagonal);
    }

    @Override
    String color() {
        return getColor().name().toLowerCase();
    }

    @Override
    double area() {
        double s;
        s = (getDiagonal() * getDiagonal()) / 2;
        return s;
    }

    @Override
    String showName() {
        return this.name;
    }

    @Override
    public String display() {
        return "Figure: " + showName() + ", area: " + area() + " units, side: "
                + getSide() + " units, color: " + color();
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
