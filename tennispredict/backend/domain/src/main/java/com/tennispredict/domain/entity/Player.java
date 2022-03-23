package com.tennispredict.domain.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@ToString
@Setter
@Getter
@EqualsAndHashCode(of = "playerId")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PLAYER")
public class Player {

    @Id
    @Column(name = "PLAYER_ID")
    @GenericGenerator(name = "player_id", strategy = "") //TODO
    @GeneratedValue(generator = "player_id")
    private Integer playerId;

    @Column(name = "NAME_FIRST")
    private String nameFirst;

    @Column(name = "NAME_LAST")
    private String nameLast;

    @Column(name = "HAND")
    private String hand;

    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_CD", referencedColumnName="COUNTRY_CD", insertable = false, updatable = false)
    private Country country;

    @Column(name = "HEIGHT")
    private Integer height;

    @Column(name = "WIKIDATA_ID")
    private String wikidataId;
}
