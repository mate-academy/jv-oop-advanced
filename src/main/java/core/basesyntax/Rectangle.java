package core.basesyntax;

public class Rectangle implements Behavior {
    private String state;
    private int firstSide;
    private int secondSide;

    public Rectangle(String state, int firstSide, int secondSide) {
        this.state = state;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void creatFigure() {
        int a = firstSide * secondSide;
        System.out.println("Figure: rectangle, area: " + a + " sq. units, side1: " + firstSide + " units, side2: " + secondSide + " units, color: " + state);
    }
}
