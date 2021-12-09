package com.grapheople.metamarket.model.helper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by 지성인 on 2021-12-02.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WebResponse {
    private int status;
    private String message;
    private String code;
}
