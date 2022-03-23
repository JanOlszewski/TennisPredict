package com.tennispredict.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ToString
@Setter
@Getter
@EqualsAndHashCode(of = "entryCd")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ENTRY")
public class Entry {

    @Id
    @Column(name = "ENTRY_CD")
    private String entryCd;

    @Column(name = "ENTRY_DESC")
    private String entryDesc;
}
