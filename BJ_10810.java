package backJoon_practice_1330;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ_10810 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //바구니 갯수

        int m = sc.nextInt();

        int arr[] = new int[n];


        //m번 만큼 반복
        for ( int i = 0; i < m; i++) {

            int I= sc.nextInt();
            int J=sc.nextInt();
            int K=sc.nextInt();

            for(int j=I-1; j<J; j++ ){

            arr[J]=K;

            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
