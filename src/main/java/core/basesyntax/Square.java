package core.basesyntax;

public class Square implements Figura {
    private final double side;
    private final String color;

    Square (double side,String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public String toString() {
        return "Figure : square, "
                + "area: " + getArea()
                + " sq. units, side: "
                + this.side + " units, color: '"
                + this.color + "'";
    }
}
