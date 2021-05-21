package core.basesyntax;

public class Square extends Figure implements FigureArea {
    private int side;

    public Square(int side, String name, String color) {
        this.side = side;
        this.name = name;
        this.color = color;
    }

    public double getArea() {
        return area = side * side;
    }

    public void printDraw() {
        System.out.println("Figure: " + name
                + ", area: " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + color);
    }
}