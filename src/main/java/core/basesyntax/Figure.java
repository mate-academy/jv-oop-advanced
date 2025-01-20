package core.basesyntax;

public abstract class Figure implements FigureTasks {

    private String color;

    public String getColor() {
        return color;
    }

    @Override
    public void GetPrint() {
    }

    public Figure(String color) {
        this.color = color;
    }
}
