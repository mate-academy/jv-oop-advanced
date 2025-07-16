package core.basesyntax;

public class Figure implements Drawable {

    protected static final int ZERO = 0;

    public double getArea() {
        return 0;
    }

    @Override
    public String draw() {
        return "Unknown figure";
    }
}
