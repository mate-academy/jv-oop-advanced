package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        this.type = "Square";
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("\n=================\ntype: "
                + this.type
                + "\ncolor: "
                + this.color
                + "\nside: "
                + this.side
                + "\narea: "
                + this.getArea());
    }
}
