package com.jpa.business.Eat;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
public class User {
    private Integer name;
    private Integer sex;

}
