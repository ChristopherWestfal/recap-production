package org.example.product;

import java.math.BigDecimal;

public record Product(String name, String itemNumber, BigDecimal price) {
}
