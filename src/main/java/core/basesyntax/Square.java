package core.basesyntax;

public abstract class Square implements DrawFigure {

    private Color color;
    private int diagonal;

    public Square(Color color, int diagonal) {
        this.color = color;
        this.diagonal = diagonal;
    }

    @Override
    public void figureInfo() {
        System.out.println(NameOfFigure.Square + " - color: " + color + " diagonal: " + diagonal);
    }
}
