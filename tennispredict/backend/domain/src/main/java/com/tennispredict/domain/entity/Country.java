package com.tennispredict.domain.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@ToString
@Setter
@Getter
@EqualsAndHashCode(of = "countryCd")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COUNTRY")
public class Country {

    @Id
    @Column(name = "COUNTRY_CD")
    private Integer playerId;

    @Column(name = "COUNTRY_CD_3")
    private String countryCd3;

    @Column(name = "COUNTRY_NAME")
    private String countryName;

    @Column(name = "ISO_CD")
    private String isoCd;
}
