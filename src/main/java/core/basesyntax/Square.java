package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        name = "square";
        this.color = color;
        this.side = side;
    }

    @Override
    public void getArea() {
        area = side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + area + " sq. units, "
                + "side: " + side + " units, " + "color: " + color);
    }
}
