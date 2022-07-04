package com.spring.study.memo;

import java.util.*;

public class MemoController {

    public static void main(String[] args) {
        String string = "string";
        List<Integer> integerList = new ArrayList<>();
        Integer[] integerArry = {7, 1, 2, 3, 5};
        Member member = new Member(); //인스턴스
        List<Member> list = new ArrayList<>();
        List<Member> listA = new ArrayList<>(Collections.singletonList(member));
        Random random = new Random();  random.nextInt(10);//난수생성

        //입출력
        System.out.println(string); // 출력
        System.out.println("integerArry" + integerArry); //주소값이 나옴
        System.out.println(Arrays.toString(integerArry)); //[3, 1, 2, 5, 7]
        System.out.println("member" + member); //memberMember [id=null, pw=0]
        System.out.println("list" + integerList); //list[], .isEmpty(null 아님)
        System.out.println("listA" + listA); // listA[Member [id=null, pw=0]]
        Scanner scanner =  new Scanner(System.in); //값을 입력 받음
        int sInt = scanner.nextInt(); // 10자리 숫자
        //scanner.next(); //문자역(공백, 줄 바꿈 문자로 구분)
        //scanner.nextLine(); //문자열 1줄

        //java
        int scaInt = 5;
       do{
           scaInt = sInt;
        }while (scaInt <= 0);            // scaInt가 0보다 클때까지 반복, do-while 무조건 한번은 실행
        String result = scaInt % 2 == 0 ? "짝수" : "홀수";

       //문자열 String
        string.startsWith("st"); //st로 시작하는 문자
        string.endsWith("ing"); //ing로 끝나는 문자
        string.charAt(2); //2번째 문자 (0부터시작)
        string.length(); //문자열 길이
        string.substring(1,3); //1~3번쨰 문자열
        string.equals("st"); //문자열 비교 true, false 반환
        string.compareTo("s");//문자열 비교(대소관계) 비교하는 값보다 작으면 음의정수, 크면 양의정수, 같으면 0
        string.indexOf("s"); //s의 위치
        string.indexOf("s", 3); //3버쨰부터 s의 위치
       // System.out.println("ABC".repeat(3)); //java11에서만 ABCABCABC 3번반복출력

        //배열 array
        Integer ind0 = integerArry[1]; //1번째 값
        int arryLength = integerArry.length;
        Integer[] copyArry = integerArry.clone(); //배열 복제
        Arrays.sort(integerArry,Collections.reverseOrder()); //내림차순 정렬 {7,5,3,2,1}
        Arrays.sort(integerArry); //오름차순 정렬 {1,2,3,5,7}
        int idx = Arrays.binarySearch(integerArry,5); // 이진검색, 정렬이 되어 있어야함, 인덱스반환


        //리스트
        //list == null은 인스턴스가 생성되자 않음
        //list.isEmpty() 인스턴스는 생성되엇으나 list안에 아무것도 없음 = ""
        integerList.size(); // size = 0
        integerList.add(2); integerList.add(null); //리스트 값 추가 [2, null]
        integerList.remove(null); //null 지우기 [2]
        integerList.get(0); //0번째 값

        //람다식 Lamda

        //힙: 동적메모리 -> 인스턴스 생성시 할당된다 new로 생성
        //객체: 객체 지향 프로그램의 대상, 생성된 인스턴스
        //클래스: 객체를 프로그래밍 하기위해 코드로 정의해 놓은 상태
        //인스턴스: new 키워드를 사용하여 클래스르 메모리에 생성한 상태
        //멤버변수 : 클래스의 속성,특징
        //메서드 : 멤버변수를 이용하여 클래스의 기능을 구현한 함수
        //참조변수 : 메모리에 생성된 인스턴스르 가리키는 변수
        //참조값 : 생성된 인스턴스의 메모리 주소값
    }

}


//getter
//setter
class Member{
    public String id;
    public int pw;

    Member(){}

    Member(String id, int pw){
        id = id;
        pw = pw;
    }

    public String getId(){ //getter
        return id;
    }

    public void setId(String id){//setter
        this.id = id;
    }

    public int getPw(){ //getter
        return pw;
    }

    public void setPw(int pw){//setter
        this.pw = pw;
    }

    public String toString(){ //toString이 있어야 출력시 값이 보임
        return "Member [id="+id +", pw="+pw+"]";
    }
}
