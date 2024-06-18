package core.basesyntax;

public abstract class Figure implements AreaComputable, DrawableFigure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

}
