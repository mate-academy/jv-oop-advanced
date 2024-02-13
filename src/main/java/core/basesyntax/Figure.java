package core.basesyntax;

abstract class Figure implements AreaAble, DrawAble {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
