package core.basesyntax;

public abstract class Figure implements FigureDraw, FigureArea {
    private String color;

    public Figure(){
    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
    }

    public void area() {
    }
}
