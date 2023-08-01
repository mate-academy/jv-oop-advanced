package core.basesyntax;

public abstract class Rectangle implements DrawFigure{

    private Color color;
    private int length;
    private int width;

    public Rectangle(Color color, int length, int width){
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public void figureInfo() {
        System.out.println(NameOfFigure.Rectangle + " - color: " + color + " length: " + length + " width: " + width);
    }
}
