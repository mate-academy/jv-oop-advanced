package core.basesyntax;

public abstract class Figure implements FigureInterface, FigureInfoInterface {
    private Color color;
    private FigureType type;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public FigureType getType() {
        return type;
    }

    public void setType(FigureType type) {
        this.type = type;
    }

    @Override //What we have to write, if each figure have method getArea as overrided?
    public double getArea() {
        return 0;
    }

    @Override //What we have to write, if each figure have method getArea as overrided?
    public String getFigureInfo() {
        return "";
    }
}
