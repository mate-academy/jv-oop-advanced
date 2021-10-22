package core.basesyntax;

public abstract class Figure implements AreaObtainer, InfoPrinter {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
