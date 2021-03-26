package DFS;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class DFSFullColor {
    public static void main(String[] args) {
        int image[][] = {{0,0,0,},{0,1,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 1;
        image = BFS(image,sr,sc,newColor);
        for (int i=0 ; i<image.length ; i++){
            for (int j=0 ; j<image[i].length ; j++){
                System.out.print(image[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] BFS(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        DFSProcess(image,sr,sc,oldColor);
        for (int i=0 ; i<image.length ; i++){
            for (int j=0 ; j<image[i].length ; j++){
                if (image[i][j] == Integer.MAX_VALUE){
                    image[i][j] = newColor;
                }
            }
            System.out.println();
        }
        return image;
    }

    private static void DFSProcess(int[][] arr1 , int i , int j,int oldColor) {
        if(i<0 || i>=arr1.length || j<0 || j>=arr1[i].length)
            return ;
        if (arr1[i][j] == oldColor) {
            arr1[i][j] = Integer.MAX_VALUE;
            DFSProcess(arr1, i + 1, j,oldColor);
            DFSProcess(arr1, i, j + 1,oldColor);
            DFSProcess(arr1, i - 1, j,oldColor);
            DFSProcess(arr1, i, j - 1,oldColor);
        }
    }
}
