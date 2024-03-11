package core.basesyntax;

public abstract class Figure implements IFigure {
    private String color;

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
        System.out.println(this.getClass().getSimpleName());
        System.out.println("colo");
    }

}
