public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void doubleWidthHeight() {
        this.width *= 2;
        this.height *= 2;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.0, 8.0);

        System.out.println("Rectangle width = " + myRectangle.getWidth() + " height = " + myRectangle.getHeight());

        myRectangle.doubleWidthHeight();

        System.out.println("After calling method doubleWidthHeight");
        System.out.println("Rectangle width = " + myRectangle.getWidth() + " height = " + myRectangle.getHeight());
    }
}
