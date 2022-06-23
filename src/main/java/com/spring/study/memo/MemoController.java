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
        Member member = new Member();
        List<Member> list = new ArrayList<>();
        List<Member> listA = new ArrayList<>(Collections.singletonList(member));

        //입출력
        System.out.println(string); // 출력
        System.out.println("member" + member); //memberMember [id=null, pw=0]
        System.out.println("list" + integerList); //list[], .isEmpty(null 아님)


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

    }

}


//getter
//setter
class Member{
    private String id;
    private int pw;

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
