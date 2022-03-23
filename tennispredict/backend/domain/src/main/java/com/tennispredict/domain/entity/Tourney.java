package com.tennispredict.domain.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Setter
@Getter
@EqualsAndHashCode(of = "tourneyCd")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TOURNEY")
public class Tourney {

    @Id
    @Column(name = "TOURNEY_CD")
    private String tourneyCd;

    @Column(name = "TOURNEY_NAME")
    private String tourneyName;

    @Column(name = "SURFACE")
    private String surface;

    @Column(name = "DRAW_SIZE")
    private Integer drawSize;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LEVEL_CD", referencedColumnName="LEVEL_CD", insertable = false, updatable = false)
    private TourneyLevel tourneyLevel;
}
