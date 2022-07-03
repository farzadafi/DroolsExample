package com.farzad.droolsexample.model;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String fullName;
    private String productName;
    private Long price;
    private Integer OffPercent;
}
