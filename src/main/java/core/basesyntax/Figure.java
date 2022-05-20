package core.basesyntax;

public abstract class Figure implements CalculateArea {
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
