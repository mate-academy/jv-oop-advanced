package core.basesyntax;

public class Square extends Figure implements FigureDetailer {
    private String name = "square";
    private int side;
    private Color color;

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public void getDetails() {
        System.out.println(getColor() + " " + name + " with side " + side + " and area of "
                + getArea());

    }

    @Override
    public Color getColor() {
        return color;
    }
}
