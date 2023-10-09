package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@IdClass(OrderItem_PK.class)
public class OrderDetails {
    @Id
    private String oid;

    @Id
    private String itemCode;
    private BigDecimal unitPrice;

    //Out-Verse
    @ManyToOne
    @JoinColumn(name = "oid", referencedColumnName = "oid",insertable = false, updatable = false)
    private Orders orders;

    //Out-Verse
    @ManyToOne
    @JoinColumn(name = "itemCode",referencedColumnName = "code",insertable = false,updatable = false)
    private Item items;

}
