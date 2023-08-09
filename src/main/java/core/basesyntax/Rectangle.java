package core.basesyntax;

public class Rectangle extends Figure implements Drawable, Calculateble {
    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getSquare() {
        return sideA * sideB;
    }
}
