package core.basesyntax;

public abstract class BaseEntity {
    private String color;

    public BaseEntity(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
