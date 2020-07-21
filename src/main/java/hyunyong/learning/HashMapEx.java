package hyunyong.learning;

import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("soo", 30);
        map.put("yong", 29);
        map.put("jun", 26);
        map.put("mom", 58);    //put 메소드로 객체 추가

        Set<String> nameSet = map.keySet();                 //KeySet() 메소드를 이용한 키와 값 얻는 방법
        Iterator<String> nameIterator = nameSet.iterator();
        while(nameIterator.hasNext()) {
            String name = nameIterator.next();
            Integer age = map.get(name);
            System.out.println("name : " + name + ", age :" + age);
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()) {                    //entrySet()메소드를 이용한 키와 값 얻는 방법
            Map.Entry<String, Integer> entry = entryIterator.next();
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println("name : " + name + ", age :" + age);
        }
        System.out.println("total entry : " + map.size());
    }
}
