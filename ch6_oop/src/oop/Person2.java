package oop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@RequiredArgsConstructor // @NOnNull(+final) 들어간 변수를 포함한 생성자
@AllArgsConstructor
@Getter
// @Setter
@ToString
public class Person2 {
    @Setter
    private String pno; // 해당하는 멤버변수의 setter 메서드만 생성
    @NonNull
    private String name;
    private String tel;

}
