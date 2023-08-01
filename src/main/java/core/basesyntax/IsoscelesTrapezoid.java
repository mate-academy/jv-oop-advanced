package core.basesyntax;

public abstract class IsoscelesTrapezoid implements DrawFigure{

    private Color color;
    private int base;
    private int edge;

    public IsoscelesTrapezoid(Color color, int base, int edge) {
        this.color = color;
        this.base = base;
        this.edge = edge;
    }

    @Override
    public void figureInfo() {
        System.out.println(NameOfFigure.IsoscelesTrapezoid + " - color: " + color + " base: " + base + " edge: " + edge);
    }
}
