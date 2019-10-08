package com.company;

public class Convert {
    private float height;
    private float width;
    private  float diagonal;

    public Convert (float height, float width){
        this.height = height;
        this.width=width;
    }

    private float getSmallestSide(){
        if (height>width){
            return width;}
            else return height;

    }

    private float getBiggestSide (){
        if (width>height){
            return  width;
        }
        else return height;
    }
    private float getDiagonal(){
         diagonal = (float) Math.pow (width,2) + (float) Math.pow(height,2);
         return (float) Math.sqrt(diagonal);
    }

    public boolean canAccomodete (Convert e) {
        return getSmallestSide() > e.getSmallestSide() && getBiggestSide() > e.getBiggestSide()&& (getDiagonal() - e.getDiagonal()) > (getBiggestSide() - e.getBiggestSide());
    }

}