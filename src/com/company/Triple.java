package com.company;
public class Triple <T,G,H>
{
    private T left;
    private G middle;
    private H right;

    public Triple (T left, G middle, H right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public void setLeft (T left) {
        this.left = left;
    }

    public G getMiddle() {
        return middle;
    }

    public void setMiddle (G middle) {
        this.middle = middle;
    }

    public H getRight() {
        return right;
    }

    public void setRight(H right) {
        this.right = right;
    }
    public String toString(){ return "("+left+","+middle+","+right+")";
}

}

