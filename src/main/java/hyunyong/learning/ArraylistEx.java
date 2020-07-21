package hyunyong.learning;

import java.util.*;

public class ArraylistEx {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  //list 변수 선언, List 컬렉션에 저장되는 객체의 타입 = String.
        list.add("java");
        list.add("animal");
        list.add("dog");
        list.add("cat");                    //add() 메소드로 객체를 맨 끝에 추가
        list.add(4,"snake");  //add(index,"") 주어진 객체를 지정된 index에 삽입
        list.set(3,"monkey");              //set(index,"") 지정된 index에 객체를 주어진 객체로 교체

        System.out.println("총 객체 수 :" + list.size());

        for(int i = 0; i < list.size(); i++) {          //저장된 총 객체 수만큼 루핑

            System.out.println(i + ":" + list.get(i));  // get메소드를 사용하여 객체 얻기

        }
        list.remove(2);
        list.remove("snake");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
    }
}


