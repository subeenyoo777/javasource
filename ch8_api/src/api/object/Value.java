package api.object;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Value [value=" + value + "]";
    }

    // toString() : 멤버변수 값 출력 용도로 재정의
    // @Override
    // public String toString() {
    // return value + ""; // value를 String으로 전환
    // }

}
