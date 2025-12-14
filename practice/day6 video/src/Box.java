class Box {
    private double width;
    private double depth;
    private double height;

    Box(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    Box(double side) {
        this(side, side, side);
    }

    Box() {
        this(-1);
    }

    String getBoxDimensions() {
        return "W=" + width + ", D=" + depth + ", H=" + height;
    }

    // compare equality of two boxes
    boolean checkEquality(Box anotherBox) {
        return this.width  == anotherBox.width &&
               this.depth  == anotherBox.depth &&
               this.height == anotherBox.height;
    }

    // return a new Box with modified dimensions
    Box createNewBox(double wOffset, double dOffset, double hOffset) {
        Box newBox = new Box(
            this.width + wOffset,
            this.depth + dOffset,
            this.height + hOffset
        );
        return newBox;
    }
}
