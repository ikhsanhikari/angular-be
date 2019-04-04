package com.angular.be.angularbe.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * Created by hikari on 15/11/2018.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JsonWrapper {
    private Object data;
    private int itemsSize;
    private String ActionType;
    private HttpStatus httpStatus;


}
