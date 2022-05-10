package com.spring.study.logic;

public class ch01 {
    public static void main(String[] args) {
        //최솟값과 최댓값 구하기
        //수행속도는 나열된 수의 개수에 비례하므로 O(n)
        int[] maxMinList = {10,55,23,2,79,101,16,82,30,45,1};

        int max = maxMinList[0];
        int maxIndex = 1;
        int min = maxMinList[0];
        int minIndex = 1;

        for(int i = 1; i < maxMinList.length; i++){
            if(maxMinList[i] > max){
                max = maxMinList[i];
                maxIndex = i+1;
            }
            if(maxMinList[i] < min){
                min = maxMinList[i];
                minIndex = i+1;
            }
        }

        System.out.println("최소 : "+min +" 번째 : " + minIndex);
        System.out.println("최대 : "+max +" 번째 : " + maxIndex);

        //정렬된 수에서 하느의 수의 위치 찾기

    }
}
