package core.basesyntax;

public class RightTriangle extends Figure implements FigureDetailer {
    private String name = "right triangle";
    private int firstLeg;
    private int secondLeg;
    private Color color;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public int getArea() {
        return (int) (0.5 * (firstLeg * secondLeg));
    }

    @Override
    public void getDetails() {
        System.out.println(getColor() + " " + name + " with height " + firstLeg + ", foundation "
                + secondLeg + " and area of " + getArea());

    }

    @Override
    public Color getColor() {
        return color;
    }
}
