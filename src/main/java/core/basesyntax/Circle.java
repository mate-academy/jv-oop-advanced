package core.basesyntax;

public abstract class Circle implements DrawFigure{

    private Color color;
    private int radius;

    public Circle(Color color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void figureInfo() {
        System.out.println(NameOfFigure.Circle + " - color: " + color + " radius: " + radius);
    }
}
