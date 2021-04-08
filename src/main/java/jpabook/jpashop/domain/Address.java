package jpabook.jpashop.domain;

import javax.persistence.Embeddable;
import lombok.Getter;

/**
 * Created by IntelliJ IDEA
 * User: hojun
 * Date: 2021-04-08 Time: 오후 1:01
 */

@Embeddable
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
