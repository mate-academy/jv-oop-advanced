package core.basesyntax;

public class GetFigure implements GetFigureArea {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public void drawFigure() {
        System.out.println("GetFigure color: " + color);
    }
}
