package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, String color, int side) {
        super.name = name;
        super.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: " + name + ", area: " + getArea() +
                " sq.units, side: " + side + " units, color: " + color);
    }
}
