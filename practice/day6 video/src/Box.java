class Box {
    private double length;
    private double breadth;
    private double height;

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    Box(double side) {
        this(side, side, side);
    }

    Box() {
        this(-1);
    }

    String getBoxDimensions() {
        return "L=" + length + ", B=" + breadth + ", H=" + height;
    }
}
