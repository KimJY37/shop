package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private String customerId;
    private Integer qty;
    private String address;
}
