package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side,String color) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", side: " + side + " units, color: " + getColor());
    }
}
