package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return height * weight;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        System.out.println(
                sb.append("Figure: rectangle, area: ")
                        .append(getArea())
                        .append(" sq.units, height: ")
                        .append(height)
                        .append("units, weight: ")
                        .append(weight)
                        .append(" units, color: ")
                        .append(getColor()));
    }
}
