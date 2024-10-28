package core.basesyntax;

public class FigureTwo extends Figure {

    private double firsSide; // длина
    private double secondSide; // ширина

    public FigureTwo(String color, double firsSide, double secondSide) {
        super(color);
        this.firsSide = firsSide;
        this.secondSide = secondSide;
    }

    public double getFirsSide() {
        return firsSide;
    }

    public double getSecondSide() {
        return secondSide;
    }
}
