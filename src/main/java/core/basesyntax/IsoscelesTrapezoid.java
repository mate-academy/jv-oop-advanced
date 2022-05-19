package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int bottomSide;
    private int height;

    @Override
    public double getArea() {
        return (upperSide + bottomSide) / 2 * height;
    }

    @Override
    public void drawInfo() {
        System.out.println("IsoscelesTrapezoid. Upper side: " + upperSide
                + ". Bottom side: " + bottomSide + ". Height: " +
                + height + ". Area: " + getArea() + ". Color: " + getColor());
    }
}
