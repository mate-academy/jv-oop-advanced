package core.basesyntax;

public class RightTriangle extends Figure {
    private int oneSide;
    private int secondSide;

    public RightTriangle(String color, int oneSide, int secondSide) {
        super(color);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
    }

    @Override
    public void getArea() {
        System.out.println(oneSide * secondSide / 2);
    }
}
