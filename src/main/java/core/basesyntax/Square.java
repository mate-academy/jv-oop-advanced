package core.basesyntax;

public class Square extends Figure implements Areacount {
    private int side;

    public Square(int side,String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" + "area: " + getArea() + " || " + "color: " + getColor() + '}';
    }
}
