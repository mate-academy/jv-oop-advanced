public abstract class Figure implements Drawable, CalculatingArea {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
