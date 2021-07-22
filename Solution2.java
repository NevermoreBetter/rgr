package com.company;
import java.util.ArrayList;
public class Solution2 {

    public static ArrayList<double[]> SolveRK3(double[] ArrCoef, double xk, double h) {//xk -кінцева точка для х, h -крок
        int n = (int) (xk / h + 1); //// кіл-сть точок

        double[] X = new double[n];// для координати Х
        double[] Y = new double[n];// для координати Y

        X[0] = 0;// точки для початку ф-ї
        Y[0] = 0;

        for (int i = 1; i < n; i++) {
            Y[i] = RK3(Y[i - 1], h, ArrCoef);
            X[i] = X[i - 1] + h;
        }

        ArrayList<double[]> res = new ArrayList<>(); // додавання в список
        res.add(Y);
        res.add(X);
        return res;
    }

    private static double DdY(double[] ArrCoef, double y) {
        return -(ArrCoef[2] + ArrCoef[1] * y) / ArrCoef[0];
    }

    private static double RK3(double yi, double h, double[] ArrCoef) {
        double k1 = h * DdY(ArrCoef, yi);
        double k2 = h * DdY(ArrCoef, yi + k1 / 2);
        double k3 = h * DdY(ArrCoef, yi - k1 + 2 * k2);
        return yi + (1.0/6.0 * (k1 + 4 * k2 + k3));
    }
}


