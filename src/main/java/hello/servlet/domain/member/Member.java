package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Imaspear on 2022-01-09
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */

@Getter
@Setter
public class Member {

    private Long id;
    private String username;
    private int age;

    public Member() {
    }

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
