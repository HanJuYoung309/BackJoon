package backJoon_practice_1330;

import java.util.Scanner;

public class BJ_2562 {

    public static void main(String[] args) {

        //최댓값을 찾고 그 최댓값이 몇번째 프로그램인지?

        Scanner sc= new Scanner(System.in);

        int arr[]= new int[]{3
                ,29
                ,38
                ,12
                ,57
                ,74
                ,40
                ,85
                ,61};

        int max=0;

        int temp= arr[0];
        int maxPos=0;
        int i=0;

        for(i=0; i<arr.length; i++){

             arr[i]=sc.nextInt();

          if(arr[i]>max){
              max=arr[i];
              maxPos=i+1;
          }
        }
        System.out.println(max);
        System.out.println(maxPos);

    }
}
