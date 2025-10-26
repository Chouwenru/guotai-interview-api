package com.cathaybk.interview.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "currency")
@Getter
@Setter
public class Currency {

    @Id
    private String code;

    @Column(name = "chinese_name")
    private String chineseName;
}


