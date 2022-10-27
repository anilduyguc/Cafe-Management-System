package com.kenobi.cafe.wrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductWrapper {
    private Integer id;
    private String description;
    private String name;
    private Integer price;
    private String status;
    private Integer categoryId;
    private String categoryName;
}
