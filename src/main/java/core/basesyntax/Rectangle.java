package core.basesyntax;

public class Rectangle extends Figure implements Areacount,Figuredrawing {
    private int breadth;
    private int length;

    public Rectangle(int breadth,int length,String color) {
        this.breadth = breadth;
        this.length = length;
        setColor(color);
    }

    @Override
    public double getArea() {
        return breadth * length;
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: ").append("rectangle, ").append("area: ").append(getArea())
                .append(" sq.units, ").append("breadth: ").append(breadth)
                .append(" units, ").append("length: ").append(length)
                .append(" units, ").append("color: ").append(getColor());
        return builder.toString();
    }

    @Override
    public String toString() {
        return draw();
    }
}
