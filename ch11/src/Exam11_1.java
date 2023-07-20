import java.util.ArrayList;
import java.util.Arrays;

public class Exam11_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        ArrayList<Integer> kyo = new ArrayList();
        ArrayList<Integer> cha = new ArrayList();
        ArrayList<Integer> hap = new ArrayList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        
        // 교집합
        kyo.addAll(list1); // list1 kyo . 의 모든 요소를 에 저장한다
        kyo.retainAll(list2); // list2 kyo . 와 의 공통요소만 남기고 삭제한다
        
        // 차집합
        cha.addAll(list1);
        cha.removeAll(list2); // cha list2 . 에서 와 공통된 요소들을 모두 삭제한다
        
        // 합집합
        hap.addAll(list1); // list1 hap . 의 모든 요소를 에 저장한다
        hap.removeAll(kyo); // hap kyo . 에서 와 공통된 모든 요소를 삭제한다
        hap.addAll(list2); // list2 hap . 
        
        System.out.println(kyo);
        System.out.println(cha);
    }
}
