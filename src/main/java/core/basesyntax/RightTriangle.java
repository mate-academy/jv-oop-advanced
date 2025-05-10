package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String nameFigure, int firstLeg, int secondLeg, String colour) {
        this.setNameFigure(nameFigure);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColour(colour);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getNameFigure()
                + ", area: " + firstLeg * secondLeg * 0.5
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + this.getColour());
    }
}

