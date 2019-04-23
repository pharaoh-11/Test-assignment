package shapes.colors;

public enum Colors {
    BLACK("black"), GREEN("green"), RED("red"), BLUE("blue"), YELLOW("yellow"), GRAY("gray");

    private String name;

    Colors(String name) {
        this.name = name;
    }

    public String getColor() {
        return name;
    }
}
