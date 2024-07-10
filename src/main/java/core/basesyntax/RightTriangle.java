package core.basesyntax;

public class RightTriangle implements Figure {
    private static final int RIGHT_TRIANGLE_NUMBER = 2;
    private int sid;
    private String color;
    public RightTriangle() {
        this.sid = sid;
        this.color = color;

    }

    @Override
    public double getArea() {
        return sid / RIGHT_TRIANGLE_NUMBER * sid;
    }
}
