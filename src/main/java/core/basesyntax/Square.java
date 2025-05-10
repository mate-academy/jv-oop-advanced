package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
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
