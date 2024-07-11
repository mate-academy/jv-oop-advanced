package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;
    private String type;

    public Figure(String color, String type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public void draw() {
        String text = "Figure: " + type;
        text += ", area: " + calculateArea() + " sq. units, ";
        text += getAdditionalInfo() + ", color: " + color;

        System.out.println(text);
    }

    protected abstract String getAdditionalInfo();
}
