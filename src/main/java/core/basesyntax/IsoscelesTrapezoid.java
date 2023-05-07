package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;
    @Override
    public void drawArea() {
        System.out.println("Figure's area is " + ((sideA + sideB) / 2) * height);
    }
}
