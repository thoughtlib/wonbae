package com.wonbae.wonbae.board.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import util.BaseTimeEntity;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class Board extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int(11) commnet '게시판번호'")
    private Integer id;
    @Column(nullable = false, columnDefinition = "varchar(100) comment '제목'")
    private String title;
    @Column(nullable = false, columnDefinition = "text comment '본문'")
    private String content;
    @Column(nullable = false, columnDefinition = "bit(1) comment '메뉴사용우무(1: 사용,2: 미사용)'")
    private Boolean used;

    @PrePersist
    void setStat() {
        this.used = true;
    }

    public void deleteStat() {
        this.used = false;
    }
}
