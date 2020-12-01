package core.basesyntax;

public class Figures {
    private Colors color;
    private int area;

    public Figures(Colors color, int area) {
        this.color = color;
        this.area = area;
    }
    public String getColor() {
        return color.toString();
    }

    public int getArea() {
        return area;
    }
}
