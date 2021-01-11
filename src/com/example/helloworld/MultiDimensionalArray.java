package com.example.helloworld;

public class MultiDimensionalArray {
    public static void main(String[] args){
        int[][] grid={{2,4,56},{23,57},{7,8,4,0,9}};   //multi dimensional array(more than one dimension is required to get the value
        System.out.println(grid[1][1]);

        for (int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                System.out.print(grid[row][col]+" ");
            }
            System.out.println();
        }
    }
}
