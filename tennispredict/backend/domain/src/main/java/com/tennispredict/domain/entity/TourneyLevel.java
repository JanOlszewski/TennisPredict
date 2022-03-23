package com.tennispredict.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ToString
@Setter
@Getter
@EqualsAndHashCode(of = "levelCd")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TOURNEY_LEVEL")
public class TourneyLevel {

    @Id
    @Column(name = "LEVEL_CD")
    private String levelCd;

    @Column(name = "LEVEL_NAME")
    private String levelName;
}
