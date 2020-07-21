package hyunyong.learning;

import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= 6; i++) {
            set.add(i);
        }
        System.out.println("총 객체 수 : " + set.size());
        set.add(3);
        set.add(6);
        System.out.println(set.size());  //객체를 중복해서 저장할 수 없기 때문에 add를 해도 총 객체 수는 변하지 않음

        Iterator<Integer> iterator = set.iterator();  // Iterator 인터페이스를 구현한 객체, 반복자
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
