package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Draw square");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return "Square";
    }

    public int getSide() {
        return side;
    }
}
