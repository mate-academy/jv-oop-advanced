package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
        super.setArea(side * side);

    }

    @Override
    public void draw() {
        System.out.print("Name: square");
        super.draw();
        System.out.println("side: " + side + " units");
    }
}
