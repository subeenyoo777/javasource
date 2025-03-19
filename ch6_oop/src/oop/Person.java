package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter // 모든 멤버변수의 setter 메서드 작성

public class Person {

    private String pno;
    private String name;
    private String tel;
}
