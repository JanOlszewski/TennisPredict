package com.tennispredict.domain.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@ToString
@Setter
@Getter
@EqualsAndHashCode(of = "matchId")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MATCH")
public class Match {

    @Id
    @Column(name = "MATCH_ID")
    @GenericGenerator(name = "match_id", strategy = "") //TODO
    @GeneratedValue(generator = "match_id")
    private Integer matchId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOURNEY_CD", referencedColumnName="TOURNEY_CD", insertable = false, updatable = false)
    private Tourney tourney;

    @Column(name = "TOURNEY_DATE")
    private Date tourneyDate;

    @Column(name = "MATCH_NUM")
    private Integer matchNum;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAYER_ID", referencedColumnName="WINNER_ID", insertable = false, updatable = false)
    private Player winner;

    @Column(name = "WINNER_SEED")
    private Integer winnerSeed;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ENTRY_CD", referencedColumnName="WINNER_ENTRY_CD", insertable = false, updatable = false)
    private Entry winnerEntry;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAYER_ID", referencedColumnName="LOSER_ID", insertable = false, updatable = false)
    private Player loser;

    @Column(name = "LOSER_SEED")
    private Integer loserSeed;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ENTRY_CD", referencedColumnName="LOSER_ENTRY_CD", insertable = false, updatable = false)
    private Entry loserEntry;

    @Column(name = "SCORE")
    private String score;

    @Column(name = "BEST_OF")
    private Integer bestOf;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MATCH_ROUND_CD", referencedColumnName="MATCH_ROUND_CD", insertable = false, updatable = false)
    private MatchRound matchRound;

    @Column(name = "MINUTES")
    private Integer minutes;

    @Column(name = "W_ACE")
    private Integer wAce;

    @Column(name = "W_DF")
    private Integer wDf;

    @Column(name = "W_SV_PT")
    private Integer wSvPt;

    @Column(name = "W_1ST_LN")
    private Integer w1StLn;

    @Column(name = "W_1ST_WON")
    private Integer w1StWon;

    @Column(name = "W_2ST_WON")
    private Integer w2StWon;

    @Column(name = "W_SV_GMS")
    private Integer wSvGms;

    @Column(name = "W_BP_SAVED")
    private Integer wBpSaved;

    @Column(name = "W_BP_FACED")
    private Integer wBpFaced;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RANKING_ID", referencedColumnName="W_RANKING_ID", insertable = false, updatable = false)
    private Ranking wRanking;

    @Column(name = "L_ACE")
    private Integer lAce;

    @Column(name = "L_DF")
    private Integer lDf;

    @Column(name = "L_SV_PT")
    private Integer lSvPt;

    @Column(name = "L_1ST_LN")
    private Integer l1StLn;

    @Column(name = "L_1ST_WON")
    private Integer l1StWon;

    @Column(name = "L_2ST_WON")
    private Integer l2StWon;

    @Column(name = "L_SV_GMS")
    private Integer lSvGms;

    @Column(name = "L_BP_SAVED")
    private Integer lBpSaved;

    @Column(name = "L_BP_FACED")
    private Integer lBpFaced;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RANKING_ID", referencedColumnName="L_RANKING_ID", insertable = false, updatable = false)
    private Ranking lRanking;
}
