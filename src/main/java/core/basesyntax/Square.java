package core.basesyntax;

public class Square extends Figure {
    private int sides;

    public Square(String color, int sides) {
        super(color, "square");
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    @Override
    public int getArea() {
        return this.sides * this.sides;
    }

    @Override
    public String draw() {
        return super.draw() + ", sides : " + getSides() + " units";
    }
}
