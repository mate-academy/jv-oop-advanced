package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLengthOfTrapezoid;
    private int secondLengthOfTrapezoid;
    private int heightOfTrapezoid;

    public IsoscelesTrapezoid(int firstLengthOfTrapezoid,
                              int secondLengthOfTrapezoid,
                              int heightOfTrapezoid,
                              Color color) {
        super(color);
        this.firstLengthOfTrapezoid = firstLengthOfTrapezoid;
        this.secondLengthOfTrapezoid = secondLengthOfTrapezoid;
        this.heightOfTrapezoid = heightOfTrapezoid;
    }

    @Override
    public void drawFigure() {
        System.out.println("IsoscelesTrapezoid: "
                + "firstLength = " + firstLengthOfTrapezoid
                + ", secondLength = " + secondLengthOfTrapezoid
                + ", heightOfTrapezoid = " + heightOfTrapezoid
                + ", color = " + getColor()
                + ", area = " + calculateArea() + '.');
    }

    @Override
    public double calculateArea() {
        return (double)(firstLengthOfTrapezoid + secondLengthOfTrapezoid) * heightOfTrapezoid / 2;
    }
}
