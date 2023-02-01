package core.basesyntax;

public class IsoscelesTrapezoid extends Shape implements Drawable, Figure {
    // isosceles trapezoid area formula is (a + b) * h / 2
    private int height; // h
    private int longerBase; // b
    private int shorterBase; // a

    @Override
    public void draw() {
        System.out.println();
    }

    @Override
    public double getArea() {
        return ((longerBase + shorterBase) * height) / 2;
    }
}
