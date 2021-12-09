package com.grapheople.metamarket.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by 지성인 on 2021-12-01.
 */
@Entity
@Table(name = "member")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Member extends BaseEntity {
    private String nickname;
    private String email;
    private String password;
}
