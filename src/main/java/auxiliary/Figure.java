package auxiliary;

public abstract class Figure implements Draw, GetArea {
    protected String color;

    public void setRandomColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.color = colorSupplier.getRandomColor();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
