package com.angular.be.angularbe.exception;

import lombok.*;

import java.util.Date;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseAPIErrorDTO {
    private Date timestamp;
    private Integer status;
    private String message;
    private String error;
}
