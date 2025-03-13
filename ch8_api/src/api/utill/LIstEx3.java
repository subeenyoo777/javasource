package api.utill;

import java.util.ArrayList;
import java.util.List;
import api.object.Person;

public class LIstEx3 {

    public static void main(String[] args) {
        // person 객체를 리스트에 담기.

        List<Person> list = new ArrayList<>();
        list.add(new Person("hong12", "홍길동"));
        list.add(new Person("kang12", "공길동"));
        list.add(new Person("kim12", "김길동"));
        list.add(new Person("park12", "박길동"));
        list.add(new Person("hwang12", "황길동"));

        for (Person person : list) {
            System.out.println(person); // person.toString()
        }
        // 아이디 이름
        // -----------------------
        // hong

        System.out.println("아이디\t 이름");
        System.out.println("------------------");

        for (Person person : list) {
            System.out.printf("%s\t%s\n", person.getId(), person.getName());
        }
    }

}
// print :
// Person [id=hong12, name=홍길동]
// Person [id=kang12, name=공길동]
// Person [id=kim12, name=김길동]
// Person [id=park12, name=박길동]
// Person [id=hwang12, name=황길동]