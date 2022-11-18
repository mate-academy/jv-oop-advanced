package core.basesyntax;

public class Figures implements DrawFigure, GetArea {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void drawFigure() {
        System.out.println("Empty figure");
    }

    @Override
    public double getArea() {
        return 0;
    }
}
