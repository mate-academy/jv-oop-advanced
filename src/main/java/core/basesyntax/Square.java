package core.basesyntax;

public class Square extends Figure {
    private Color color;
    private int side;

    public Square(Color color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("This is Square; Color: " + color + "; area: " + getArea() + ";");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
