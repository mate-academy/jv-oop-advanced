package core.basesyntax;

public class RightTriangle extends Figure implements FigureDetailer {
    private FigureE name = FigureE.TRIANGLE;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void getArea() {
        System.out.println(0.5 * (firstLeg * secondLeg));
    }

    @Override
    public void getDetails() {
        System.out.print(getColor() + " " + name + " with height " + firstLeg + ", foundation "
                + secondLeg + " and area of ");
        getArea();
    }

}
