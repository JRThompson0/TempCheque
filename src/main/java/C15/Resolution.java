package C15;

public class Resolution
{
    private int width;
    private int height;
    public Resolution()
    {}
    public Resolution(int x, int y)
    {
        this.width=x;
        this.height=y;
    }
    public void setHeight(int height)
    {
    this.height=height;
    }
    public void setWidth(int width)
    {
        this.width=width;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public String toString()
    {
        return width+" x "+height;
    }
}
