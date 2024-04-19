package C15;

public class Dimensions
{
    int height;
    int width;
    int depth;
    public Dimensions(int width, int height, int depth)
    {
        this.depth=depth;
        this.height=height;
        this.width=width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

}
