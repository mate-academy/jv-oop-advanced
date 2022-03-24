package core.basesyntax;

public class Figure implements AreaDrawing {
    private String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void paint() {
        System.out.println("Please close the window!");
    }
}
