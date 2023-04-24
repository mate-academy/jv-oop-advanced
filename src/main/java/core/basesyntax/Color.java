package core.basesyntax;

public enum Color {
  WHITE("white"),
  RED("red"),
  BLUE("blue"),
  BLACK("black"),
  ORANGE("orange"),
  PURPLE("purple"),
  GREEN("green");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
