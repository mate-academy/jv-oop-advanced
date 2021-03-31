package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureArea {
    private final int height;
    private final int mediumLine;

    public IsoscelesTrapezoid(int height,int mediumLine,String color, String property) {
        setColor(color);
        setProperty(property);
        this.height = height;
        this.mediumLine = mediumLine;
        setPropertyLength(mediumLine);
        areaCalculate();
    }

    @Override
    public void areaCalculate() {
        setArea(height * mediumLine);
    }
}
