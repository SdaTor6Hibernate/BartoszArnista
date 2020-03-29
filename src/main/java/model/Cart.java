package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CRT_QUANTITY")
    private int quantity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CRT_ORD_ID", referencedColumnName = "ORD_ID")
    private Order order;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CRT_PRO_ID", referencedColumnName = "PRO_ID")
    private Product product;

}
