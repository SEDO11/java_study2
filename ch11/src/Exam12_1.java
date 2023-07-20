
class Box<T> {
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

}

public class Exam12_1 {
    public static void main(String[] args) {
        // 제너릭을 이용해 객체를 선언할 때에는 타입이 동일해야 한다.=
//        Box<Object> b = new Box<String>();
//        Box<Object> b2 = (Object) new Box<String>();
//        new Box<String>().setItem(new Object());
        new Box<String>().setItem(new String("ABC"));
    }
}
