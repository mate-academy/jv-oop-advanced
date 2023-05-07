package core.basesyntax;

public class RightTriangle extends Figure {
    private double heigh;
    private double base;

    @Override
    public void drawArea() {
        System.out.println("Figure's area is " + (heigh * base) / 2);
    }
}
