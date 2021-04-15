package jpabook.jpashop.repository;

import jpabook.jpashop.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA
 * User: hojun
 * Date: 2021-04-15 Time: 오후 10:34
 */

@Getter @Setter
public class OrderSearch {
    private String memberName; // 회원 이름 
    private OrderStatus orderStatus; // 주문 상태
}
