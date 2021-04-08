package jpabook.jpashop.domain.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA
 * User: hojun
 * Date: 2021-04-08 Time: 오후 1:29
 */
@Entity
@DiscriminatorValue("A")
@Getter
@Setter
public class Album extends Item{
    private String artist;
    private String etc;
}
