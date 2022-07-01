package com.spring.study.memo;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.Arrays;

public class LogicMemoContorller {
    static int[] buff; //병합정렬 작업용 배열
    public static void main(String[] args) {
        int n = 5;

        //1~n 총합, 가우스의 덧셈
        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);

        //정삼각형
        System.out.println("정삼각형");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //직각삼각형(왼쪽위)
        System.out.println("왼쪽위");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) { // n - i + 1 개의 '*'을  출력
                System.out.print("*");
            }
            System.out.println();
        }

        //직각삼각형(왼쪽아래)
        System.out.println("왼쪽아래");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //직각삼각형(오른쪽위)
        System.out.println("오른쪽위");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    //System.out.print("*");
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {            // i 행( i = 1, 2, ... , n )
            for (int j = 1; j <= i - 1; j++)         // i - 1 개의 ' '을  출력
                System.out.print(' ');
            for (int j = 1; j <= n - i + 1; j++)   // n - i + 1 개의 '*'을  출력
                //System.out.print('*');
                System.out.print(j);
            System.out.println();                  // 줄바꿈
        }

        //직각삼각형(오른쪽아래)
        System.out.println("오른쪽아래");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < (n - i + 1)) {
                    System.out.print(" ");
                } else {
                    //System.out.print("*");
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {            // i 행( i = 1, 2, ... , n )
            for (int j = 1; j <= n - i; j++)         // n - i 개의 ' '을  출력
                System.out.print(' ');
            for (int j = 1; j <= i; j++)            // i 개의 '*'을  출력
                //System.out.print('*');
                System.out.print(j);
            System.out.println();                  // 줄바꿈
        }

        //피라미드
        System.out.println("피라미드");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j <= n + i - 1; j++) {
                //System.out.print("*");
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {                    // i 행( i = 1, 2, ... , n )
            for (int j = 1; j <= n - i; j++)            // n - i 개의 ' ' 을 출력
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {    // (i - 1) * 2 + 1 개의 '*' 을 출력
                //System.out.print('*');                      //위에서 print를 해서 다음부터 바로 찍음 그래서 갯수만 해줘도 됨
                System.out.print(j);
            }
            System.out.println();                                    // 줄바꿈
        }   /*  5
               456
              34567
             2345678
            123456789
                1
               123
              12345
             1234567
            123456789   */

        //최대공약수
        //유클리드 호제법_최대공약수
        int x = 3;
        int y = 9;
        System.out.println("재귀함수를 활용한 최대공약수 : " + gcd(x, y));

        //하노이의 탑
        move(x, 1, 3); //1번기중에 쌓인 x개의 원반을 3번기둥으로 옮김

        //8룩문제(8퀸배치)
        set(0);

        //========== 정렬
        int[] sort = {77, 231, 45, 6, 2, 14, 12, 4, 35};
        int nx = sort.length;

        //쉐이커 버블정렬 (양방향 버블 정렬)
        int[] sha = sort.clone();
        shakerSort(sha, nx);                // 배열 x를 양방향 버블 정렬
        System.out.println("세이커버블정렬 " + Arrays.toString(sha));

        //단순교환정렬(버블정렬)
        int[] bub = sort.clone();
        bubbleSort(bub, nx);
        System.out.println("단순교환정렬 " + Arrays.toString(bub));

        //단순선택정렬
        int[] sel = sort.clone();
        selectionSort(sel, nx);
        System.out.println("단순선택정렬 " + Arrays.toString(sel));

        //단순삽입정렬
        int[] ins = sort.clone();
        insertionSort(ins, nx);
        System.out.println("단순삽입정렬 " + Arrays.toString(ins));

        //셀정렬(단순삽입정렬 보안)
        int[] she = sort.clone();
        insertionSort(she, nx);
        System.out.println("셀정렬 " + Arrays.toString(she));

        //퀵정렬
        int[] qui = sort.clone();
        quickSort(qui,0, nx-1);
        System.out.println("퀵정렬 " + Arrays.toString(qui));

        //병합정렬
        int[] mer = sort.clone();
        buff = new int[nx];
        mergeSort(mer,0,nx-1);
        buff = null; //작업용 배열 해제
        System.out.println("병합정렬 " + Arrays.toString(mer));
    }

    //유클리드 호제법_최대공약수
    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    //하노이의 탑
    static void move(int no, int x, int y) {
        if (no > 1) { //시작기둥에서 중간 기둥으로 옮김
            move(no - 1, x, 6 - x - y); //6은 기둥번호의 합, 6-x-y는 중간기둥
        }
        System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);
        if (no > 1) { // 중간기중에서 목표기둥으로 옮김
            move(no - 1, 6 - x - y, y);
        }
    }

    //8퀸 배치법
    static boolean[] flag_a = new boolean[8];        // 각행에 퀸을 배치했는지 체크
    static boolean[] flag_b = new boolean[15];        // /대각선에 퀸을 배치했는지 체크
    static boolean[] flag_c = new boolean[15];        // ＼대각선에 퀸을 배치했는지 체크
    static int[] pos = new int[8];    // 각열의 퀸의 위치

    //--- 배치 상황(각열의 퀸의 위치)을 출력 ---//
    static void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.printf("%s", j == pos[i] ? "■" : "□");
            System.out.println();
        }
        System.out.println();
    }

    //--- i열의 알맞은 위치에 퀸을 배치 ---//
    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag_a[j] == false &&                        // 가로(j행)에 미배치
                    flag_b[i + j] == false &&                // /대각선에 미배치
                    flag_c[i - j + 7] == false) {        // ＼대각선에 미배치
                pos[i] = j;                    // 퀸을 j행에 배치
                if (i == 7)                    // 모든 열에 배치 마침
                    print();
                else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
        }
    }

    //--- 양방향 버블 정렬(셰이커 정렬)---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void shakerSort(int[] a, int n) {
        int left = 0;
        int right = n - 1;
        int last = right;

        while (left < right) {
            for (int j = right; j > left; j--) { //오른쪽에서 왼쪽으로 가장 작은수 정렬
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            left = last; //왼쪽에서 가장 마지막에 바꾼 위치

            for (int j = left; j < right; j++) { //왼쪽에서 오른쪽으로 가장 큰 수 정렬
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    last = j;
                }
            }
            right = last; //오늘쪽에서 마지막에 바꾼 위치
        }
    }

    //--- 단순교환정렬(버전 2 : 교환 횟수에 따른 멈춤)---//
    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int exchg = 0;                          // 패스에서 교환하는 횟수
            for (int j = n - 1; j > i; j--)
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchg++;
                }
            if (exchg == 0) break;                // 교환이 이루어지지 않으면 멈춤
        }
    }

    //단순선택정렬
    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            swap(a, i, min);
        }
    }

    //단순삽입정렬
    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];
            for (j = i; j > 0 && a[j - 1] > tmp; j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }
    }

    //셀정렬
    static void shellSort(int[] a, int n) {
        int h;
        for (h = 1; h < n; h = h * 3 + 1) ; //n을 넘지않는 h*3+1값

        for (; h > 0; h /= 3) {
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                    a[j + h] = tmp;
                }
            }
        }

    }

    //퀵정렬
    static int sort3elem(int[] x, int a, int b, int c){ //x[a], x[b]. x[c]를 정렬(가운데 값 인덱스를 반환)
        if(x[b] < x[a]) swap(x,b,a);
        if(x[c] < x[b]) swap(x,c,b);
        if(x[b] < x[a]) swap(x,b,a);
        return b;
    }
    static void quickSort(int[] a, int left, int right){
        int pl = left;                                  // 왼쪽 커서
        int pr = right;                                 // 오른쪽 커서
        int m = sort3elem(a, pl, (pl + pr) / 2, pr);    // 맨 앞・맨 끝・가운데를 정렬
        int x = a[m];                                   // 피벗

        swap(a, m, right - 1);            // 가운데 요소와 맨 끝에서 2번째 요소를 교환
        pl++;                             // 왼쪽 커서를 1 오른쪽으로
        pr -= 2;                          // 오른쪽 커서를 2 왼쪽으로

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr)  quickSort(a, left, pr);
        if (pl < right) quickSort(a, pl, right);
    }

    //병합정렬
    static void mergeSort(int[] a, int left, int rigth) {
        if(left < rigth){
            int i;
            int center = (left + rigth) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            mergeSort(a, left, center);
            mergeSort(a, center+1, rigth);

            for(i = left; i <= center; i++){
                buff[p++] = a[i];
            }
            while (i<= rigth && j <p){
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
            }
            while (j<p){
                a[k++] = buff[j++];
            }
        }
    }
}
