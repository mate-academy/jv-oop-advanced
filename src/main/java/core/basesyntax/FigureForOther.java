package core.basesyntax;

public abstract class FigureForOther extends Figure {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public FigureForOther(String color, int a, int b) {
        super(color);
        this.firstSide = a;
        this.secondSide = b;
    }

    public FigureForOther(String color, int a, int b, int c) {
        super(color);
        this.firstSide = a;
        this.secondSide = b;
        this.thirdSide = c;
    }

    public FigureForOther(String color, int a) {
        super(color);
        this.firstSide = a;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }
}
