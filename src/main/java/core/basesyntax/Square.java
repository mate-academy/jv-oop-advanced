package core.basesyntax;

public class Square extends Figure implements Behavior {
    private int leg;

    public int getLeg() {
        return leg;
    }

    public Square(int leg, String color, String name) {
        this.leg = leg;
        super.setColor(color);
        super.setName(name);
    }

    @Override
    public double getArea() {
        return leg * leg;
    }
}
