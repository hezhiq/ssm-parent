package com.hzq.demo.demo;

/**
 * @author hezq
 * @Description: 几道简单的算法
 * @date 2018/4/13 16:22
 */
public class EasyFunctionTen {

    /**
     * 1--n的阶乘和
     * @param n
     */
    public static void Factorial(int n){
        int factorial = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            factorial = i*factorial;
            sum += factorial;
        }
        System.out.println("'1--"+n+"'的阶乘和="+sum);
    }

    /**
     * 求二维数组每列的最小值
     */
    public static void minArray(){
        int[][] array = {{12,23,56,78},{96,25,23,45},{12,10,5,21}};
        int maxColLenth = array[0].length;
        int[] minArray = new int[maxColLenth];
        for(int i = 0; i < maxColLenth; i++){

        }
    }

    public static void main(String[] args) {
        Factorial(3);
    }

}