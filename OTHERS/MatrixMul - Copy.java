//2D array
import java.util.Scanner;
import java.util.*;

public class MatrixMul{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no. of rows");
            int r=sc.nextInt();
            System.out.println("Enter the no. of columns");
            int cl=sc.nextInt();
            int a[][]=new int[r][cl];     
            int b[][]=new int[r][cl];
            int c[][]=new int[r][cl];
            System.out.println("Enter the value for First matrix :");
                    System.out.println("Enter the elements ");
                    for(int i=0;i<r;i++){
                        for(int j=0;j<cl;j++){
                            a[i][j]=sc.nextInt();
                        }
                    }

                    System.out.println("Enter the value for 2nd matrix :");
                    System.out.println("Enter the elements ");
                    for(int i=0;i<r;i++){
                        for(int j=0;j<cl;j++){
                            b[i][j]=sc.nextInt();
                        }
                    }
            
                    System.out.println("First matrix :");
                    for(int i=0;i<r;i++){
                        for(int j=0;j<cl;j++){
                        System.out.print(a[i][j]+" ");
                        }
                        System.out.println();
                    }    
                    System.out.println("2nd matrix :");
                    for(int i=0;i<r;i++){
                        for(int j=0;j<cl;j++){
                        System.out.print(b[i][j]+" ");
                        }
                        System.out.println();  
                }
                 
                for(int i=0;i<r;i++){
                    for(int j=0;j<r;j++){
                        for(int k=0;k<r;k++){
                            c[i][j]=c[i][j]+a[i][k]*b[k][j];
                        }
                    }
                }
                System.out.println("matrix multiplication ");
                    for(int i=0;i<r;i++){
                        for(int j=0;j<cl;j++){
                        System.out.print(c[i][j]+" ");
                        }
                        System.out.println();  
                }
            }
    }

