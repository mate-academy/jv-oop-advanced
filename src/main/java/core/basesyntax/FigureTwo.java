package core.basesyntax;

public class FigureTwo extends Figure {

    private double firstSide; // длина
    private double secondSide; // ширина

    public FigureTwo(String color, double firsSide, double secondSide) {
        super(color);
        this.firstSide = firsSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }
}
