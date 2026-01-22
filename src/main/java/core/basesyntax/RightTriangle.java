package core.basesyntax;

public class RightTriangle implements Behavior{
    private String state;
    private int firstSide;
    private int secondSide;

    public RightTriangle(String state, int firstSide, int secondSide) {
        this.state = state;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void creatFigure() {
        double a = 0.5 * firstSide * secondSide;
        System.out.println("Figure: right triangle, area: " + a + " sq. units, side1: " + firstSide + " units, side2: " + secondSide + " units, color: " + state);
    }
}
