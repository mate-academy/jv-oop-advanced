package core.basesyntax;

public abstract class Figure implements FigureTasks {

    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public Figure(String color) {
        this.color = color;
    }

    @Override
    public void GetPrint() {
    }



}
