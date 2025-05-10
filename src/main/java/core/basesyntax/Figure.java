package core.basesyntax;

public class Figure implements AreaDrawer {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void drawArea() {
        System.out.println(color);
    }
}
