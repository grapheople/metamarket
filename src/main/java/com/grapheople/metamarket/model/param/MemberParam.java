package com.grapheople.metamarket.model.param;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by 지성인 on 2021-12-02.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MemberParam {
    private String nickName;
    private String email;
    private String password;
}
