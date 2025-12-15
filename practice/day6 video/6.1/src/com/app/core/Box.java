package com.app.core;

public class Box {
    private double width;
    private double depth;
    private double height;

    public Box(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public Box(double side) {
        this(side, side, side);
    }

    public Box() {
        this(-1);
    }

    public String getBoxDimensions() {
        return "W=" + width + ", D=" + depth + ", H=" + height;
    }

    public boolean checkEquality(Box anotherBox) {
        return this.width == anotherBox.width &&
               this.depth == anotherBox.depth &&
               this.height == anotherBox.height;
    }

    public Box createNewBox(double wOffset, double dOffset, double hOffset) {
        return new Box(
            this.width + wOffset,
            this.depth + dOffset,
            this.height + hOffset
        );
    }
}
