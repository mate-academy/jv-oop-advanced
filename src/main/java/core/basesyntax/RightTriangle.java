package core.basesyntax;

public class RightTriangle extends Figure implements FigureDrawer {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String nameFigure, int firstLeg, int secondLeg, String colour) {
        this.setNameFigure(nameFigure);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColour(colour);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getNameFigure()
                + ", area: " + this.firstLeg * this.secondLeg * 0.5
                + " sq.units, firstLeg: " + this.firstLeg
                + " units, secondLeg: " + this.secondLeg
                + " units, color: " + this.getColour());
    }
}

