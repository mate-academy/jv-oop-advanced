package core.basesyntax;

public abstract class Figure implements FigureArea, drawAble {
    private String color;

    protected Figure(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
