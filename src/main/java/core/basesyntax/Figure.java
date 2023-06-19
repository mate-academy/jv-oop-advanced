package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder("Figure: ");
        if (this instanceof SelfAware) {
            sb.append(((SelfAware) this).getShape().getDescription().toLowerCase());
        } else {
            sb.append(this.getClass().getSimpleName().toLowerCase());
        }
        sb.append(", area: ").append(String.format("%.2f", calculateArea()))
                .append(" sq.units, ");
        if (this instanceof SelfAware) {
            sb.append(((SelfAware) this).getSizeDescription());
        } else {
            sb.append("unknown dimensions");
        }
        sb.append(", color: ").append(getColor().name().toLowerCase());

        System.out.println(sb.toString());
    }
}
