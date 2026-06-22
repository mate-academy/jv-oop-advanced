package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int i) {
        super(color);
        this.side = i;
    }

    @Override
    public void toDraw() {
        System.out.println(getColor() + " Square:" + "\n side: "
                + side + "\n area " + getArea());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
