package core.basesyntax.figure;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * 2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", side: " + side + " units");
    }
}
