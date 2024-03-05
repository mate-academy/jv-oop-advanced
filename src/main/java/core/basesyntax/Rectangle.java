package core.basesyntax;

public class Rectangle extends Figure implements Drawable {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int getArea() {
        return 0;
    }
    @Override
    public String draw() {
        return null;
    }
}
