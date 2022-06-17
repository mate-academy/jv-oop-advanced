package core.basesyntax;

public class Shape implements Figure {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void getInfoAboutFigure() {
        System.out.println("Info about figure shape's.");
    }
}
