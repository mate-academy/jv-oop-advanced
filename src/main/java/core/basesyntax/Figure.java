package core.basesyntax;

public abstract class Figure implements ScaleFigure {
    private String color;
    private String type;

    public Figure(String type, String color) {

        this.color = color;
        this.type = type;
    }

    public Figure() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
