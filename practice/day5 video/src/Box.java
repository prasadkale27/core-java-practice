class Box
{
    private double width;
    private double depth;
    private double height;

    Box(double w, double d, double h)
    {
        width = w;
        depth = d;
        height = h;
    }

    // ✅ Cube Constructor
    Box(double side)
    {
        this(side, side, side);
    }

    double getBoxVolume()
    {
        return width * depth * height;
    }

    // ✅ Equality Method
    boolean checkEquality(Box anotherBox)
    {
        return this.width == anotherBox.width &&
               this.depth == anotherBox.depth &&
               this.height == anotherBox.height;
    }
}
