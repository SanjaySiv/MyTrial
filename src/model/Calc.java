package model;

public class Calc {
    public static void main(String[] args){
        int row=10;
        for(;row>0;){
            int col=row;
            while (col>=0){
                System.out.println(col);
                col-=2;
            }
            row=row/col;
            System.out.println(row);
        }
    }
}

