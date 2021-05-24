package jpabook.jpashop.controller;

import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by IntelliJ IDEA
 * User: hojun
 * Date: 2021-05-24 Time: 오후 4:55
 */

@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수 입니다.")
    private String name;

    private String city;
    private String street;
    private String zipcode;
}
