package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color) {
        super(color);
    }

    @Override
    public void drow() {
        System.out.println("Figure: square, color: " + getColor()
                + ", side: " + side + ", area: " + getArea());
    }

    @Override
    public void areaObtain() {
        setArea(side * side);
    }
}
