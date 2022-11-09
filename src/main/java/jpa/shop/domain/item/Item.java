package jpa.shop.domain.item;

import jpa.shop.domain.Category;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public abstract class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    // 이름
    private String name;

    // 가격
    private int price;

    // 재고
    private int stockQuantity;

    @ManyToMany
    private List<Category> categories = new ArrayList<>();
}
