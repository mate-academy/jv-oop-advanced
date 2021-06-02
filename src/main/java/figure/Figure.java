package figure;

public class Figure implements AreaCalculator, Drawable {
    private String type = "non type";
    private String color;

    public Figure(String color) {
        this.type = "non type";
        this.color = color;
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

    @Override
    public Double getArea() {
        return 0d;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure - type : ").append(this.type)
                .append(" color : ").append(this.color)
                .append(" area : ").append(getArea()).append(" sq.units"));
    }
}
