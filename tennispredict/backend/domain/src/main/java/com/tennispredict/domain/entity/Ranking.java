package com.tennispredict.domain.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@ToString
@Setter
@Getter
@EqualsAndHashCode(of = "rankingId")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RANKING")
public class Ranking {

    @Id
    @Column(name = "RANKING_ID")
    @GenericGenerator(name = "ranking_id", strategy = "") //TODO
    @GeneratedValue(generator = "ranking_id")
    private Integer rankingId;

    @Column(name = "RANKING_DATE")
    private Date rankingDate;

    @Column(name = "RANKING_PLACE")
    private Integer rankingPlace;

    @Column(name = "PLAYER_ID")
    private Integer playerId;

    @Column(name = "POINTS")
    private Integer points;
}
