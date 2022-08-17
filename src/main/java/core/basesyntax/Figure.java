package core.basesyntax;

public abstract class Figure implements Drawable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double area();

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder("Figure: ");

        System.out.println(
                info.append(this.getClass().getSimpleName())
                        .append(", area: ")
                        .append(String.format("%.1f", this.area()))
                        .append(" sq.units, ")
                        .append(this.getSizes())
                        .append(", color: ")
                        .append(color.toLowerCase())
        );
    }

    public StringBuilder getSizes() {
        return new StringBuilder();
    }

}
