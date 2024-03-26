package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super();
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {

        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("We have the figure square with sides "
                + side + " with the area " + side * side
                + " and color " + color);
    }
}
