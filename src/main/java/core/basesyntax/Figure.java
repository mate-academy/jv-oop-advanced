package core.basesyntax;

public class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public void figureInfo() {
        System.out.println(String.format("color : %s",color));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
