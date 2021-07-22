package com.company;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        double [][] Mat ={   {2, 1, -1,8},
                {-3, -1, 2,-11},
                {-2, 1, 2,-3} };

        System.out.println("Матриця за варіантом: ");
        Solution.print(Mat);
        System.out.println("");

        System.out.println("Матриці :"+ "\n" + "0. Корені даного СЛАР" + "\n" + "1. Нижня трикутна матриці" + "\n" + "2.Верхня трикутна матриця"+ "\n" + "3. Матриця перестановок");
        for (double[][] m : Solution.lu(Mat))
        {

            Solution.print(m);
        }

        ArrayList<double[]> result = Solution2.SolveRK3(new double[]{0.5,5,-100, 0},1, 0.05);

        String[] Y = stringFormat(result.get(0));
        String[] X = stringFormat(result.get(1));

        System.out.println("\tТ о ч к и  г р а ф і к у\t");
        System.out.println("\tX\t\t\tY");

        for(int i = 0; i < X.length; i++) {
            System.out.println("\t" +  X[i] + "\t\t" + Y[i]);
        }
    }

    private static String[] stringFormat(double[] X){
        String[] lines = new String[X.length];

        for(int i = 0; i < X.length; i++){
            String line = String.format("%.5f", X[i]);
            lines[i] = line;
        }

        return lines;
    }
}

