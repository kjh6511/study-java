package com.spring.study.memo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MemoController {
    public static void main(String[] args) {
        String string = "string";
        List<Integer> integerList = new ArrayList<>();
        Integer[] integerArry = {3, 1, 2, 5, 7};
        Member member = new Member(); //인스턴스
        List<Member> list = new ArrayList<>();
        List<Member> listA = new ArrayList<>(Collections.singletonList(member));

        //입출력
        System.out.println(string); // 출력
        System.out.println("member" + member); //memberMember [id=null, pw=0]
        System.out.println("list" + integerList); //list[], .isEmpty(null 아님)
        System.out.println("listA" + listA); // listA[Member [id=null, pw=0]]

        //문자열 String
        string.startsWith("st"); //st로 시작하는 문자
        string.endsWith("ing"); //ing로 끝나는 문자
        string.charAt(2); //2번째 문자 (0부터시작)

        //배열 array
        Integer ind0 = integerArry[0]; //0번째 값
        int arryLength = integerArry.length;

        //리스트 List
        //list == null은 인스턴스가 생성되자 않음
        //list.isEmpty() 인스턴스는 생성되엇으나 list안에 아무것도 없음 = ""
        integerList.size(); // size = 0
        integerList.add(2); integerList.add(null); //리스트 값 추가 [2, null]
        integerList.remove(null); //null 지우기 [2]

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
