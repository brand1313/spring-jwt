package com.brand13.jwt.jwttest.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "authority")
@Entity
public class Authority {

    @Id
    @Column(name = "authority_name", length = 50)
    private String authorityName;
}
