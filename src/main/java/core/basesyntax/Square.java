package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, String color, int side) {
        this.name = name;
        this.color = color;
        this.side = side;
    }

    public int area() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name
                + ", color: " + color
                + ", area: " + area() + " sq.units"
                + ", length of the side: " + side + " units"
                + ";"
        );
    }
}
