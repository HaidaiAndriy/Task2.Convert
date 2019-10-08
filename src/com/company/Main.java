package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true){
        //float width1, height1, width2, height2;
        //System.out.println("width1");
        //width1 = getFeature();
            Convert conv1 = createConvert();
            Convert conv2 = createConvert();
            if (conv1.canAccomodete(conv2))
                System.out.println("Первый конверт может вместить второй");
            else if (conv2.canAccomodete(conv1))
            System.out.println("Второй конверт может вместить первый");
            else
                System.out.println("Конверт нельзя поместить в другой");
            System.out.println("Продолжаем роботу? y/yes");
            if (!isContinue()) break;
    } }

    static Convert createConvert(){
        Scanner in = new Scanner(System.in);
        System.out.println("Новый конверт");
        System.out.println("введите ширину");
        float height = getFloat(in);
        System.out.println("введите высоту");
        float width = getFloat(in);
        return new Convert(height,width);
    }

    private static boolean isContinue(){
        Scanner in=new Scanner(System.in);
        String choice=in.nextLine();
        choice=choice.toUpperCase();
        return choice.equals("YES")||choice.equals("Y");
    }


    static float getFloat (Scanner in){
        while (true){
            String info = in.nextLine();
            if(info.length() == 0){
                showInfo();
            }
            else if (isFloat(info)){
                return  Float.parseFloat(info);
            }
            System.out.println("Введите число!");
        }
    }


    static void showInfo(){
        System.out.println("Для роботы программы необходимо внести значени (размер стороны конверта)");
    }


    static boolean isFloat(String info){
        boolean hasDot = false;
        for(int i=0;i<info.length();i++) {
            char c = info.charAt(i);
            if(c=='.'){
            if (hasDot != true)
                hasDot = true;
            else return false;
            }
        else if (!Character.isDigit(info.charAt(i))){
            return false;
        }
    }
     return true;
    }
}
