package com.tennispredict.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ToString
@Setter
@Getter
@EqualsAndHashCode(of = "matchRoundCd")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MATCH_ROUND")
public class MatchRound {

    @Id
    @Column(name = "MATCH_ROUND_CD")
    private String matchRoundCd;

    @Column(name = "MATCH_ROUND_DESC")
    private String matchRoundDesc;
}
