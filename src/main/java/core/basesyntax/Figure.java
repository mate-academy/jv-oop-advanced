package core.basesyntax;

public class Figure implements FigureDraw {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void drawInfo() {
        System.out.println("This is a figure");
    }
}
