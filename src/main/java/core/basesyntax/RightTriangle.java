package core.basesyntax;

public abstract class RightTriangle implements DrawFigure {

    private Color color;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void figureInfo() {
        System.out.println(NameOfFigure.RightTriangle + " - color: " + color
                + " first leg: " + firstLeg + " second leg: " + secondLeg);
    }
}
