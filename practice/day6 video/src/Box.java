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

    // compare equality of two boxes
    boolean checkEquality(Box anotherBox)
    {
        return this.length  == anotherBox.length &&
               this.breadth == anotherBox.breadth &&
               this.height  == anotherBox.height;
    }
}
