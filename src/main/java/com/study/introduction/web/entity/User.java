package com.study.introduction.web.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {

    @Id // primaryKey
    @GeneratedValue(strategy = GenerationType.IDENTITY) // pk 생성전력을 DB에 위임, mysql기준 pk 필드가 auto_increment로 해둔거라고 보면됨
    private long msrl;

    @Column(nullable = false, unique = true, length = 30)
    private String uid;

    @Column(nullable = false, length = 100)
    private String name;
}
