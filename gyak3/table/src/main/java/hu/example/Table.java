package hu.example;

public class Table {

    private int width, length, height, currentHeight, numberOfLegs;
    private boolean isAdjustable;
    private String color;

    public Table(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.isAdjustable = false;
        this.currentHeight = height;
        this.color = "red";
        this.numberOfLegs = 2;
    }
    public Table(int width, int length, int height, int currentHeight) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.isAdjustable = true;
        this.currentHeight = currentHeight;
        this.color="green";
        this.numberOfLegs = 4;
    }
    public int getWidth() { return width; }
    public int getLength() { return length; }
    public int getHeight() { return height; }
    public boolean isAdjustable() { return isAdjustable; }
    public int getCurrentHeight() { return currentHeight; }
    public String getColor(){ return color; }
    public int getNumberOfLegs(){ return numberOfLegs; }
    public void setHeight(int newHeight) {
        if (isAdjustable) {
            if (newHeight < 0 || newHeight > 200) {
                throw new IllegalArgumentException("Height is not correct!");
            }
            this.currentHeight = newHeight;
        } else {
            throw new UnsupportedOperationException("Table is not adjustable!");
        }
    }
    public int area() {
        return width * length;
    }
    public int getCapacity() {
        int peopleOnLength = length / 60;
        int peopleOnWidth = width / 60;
        return (peopleOnLength * 2) + (peopleOnWidth * 2);
    }
    public void repaint(String newColor){
        color = newColor;
    }
    public boolean isStable(){
        return numberOfLegs>=3;
    }
    public boolean isFoldable(){
        return isAdjustable && numberOfLegs>=4;
    }
    public int getPerimeter(){
        return 2*(width+length);
    }
}
