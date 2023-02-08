package core.basesyntax;

public class Figure implements Information, Area {
    private Color color;

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void printInformation() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
