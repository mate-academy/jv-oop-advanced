package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, Calculateble {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getSquare() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
