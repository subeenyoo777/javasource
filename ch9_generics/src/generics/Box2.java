package ch9_generics.src.generics;

public class Box2<T> {
    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class BoxEx2 {

    public static void main(String[] args) {

        Box2<String> box = new Box2<>();
        box.setItem("자바");
        // box.setItem(1);

        String result = box.getItem();

        Box2<Integer> box2 = new Box2();
        box2.setItem(1);
        int i = box2.getItem();
    }

}
