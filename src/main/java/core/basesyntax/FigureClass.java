package core.basesyntax;

public abstract class FigureClass implements InformationObtainable {
    private final Color color;
    private String info;

    public FigureClass(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public abstract double getArea();
}
