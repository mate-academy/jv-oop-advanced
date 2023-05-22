package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.setName("square");
        this.setSide(side);
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double obtainArea() {
        return side * side;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", side: " + this.getSide() + " units, color: " + this.getColor());
    }
}
