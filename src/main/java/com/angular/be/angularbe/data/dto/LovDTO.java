package com.angular.be.angularbe.data.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LovDTO implements Serializable {
    private static final long serialVersionUID = 8069066291461352441L;
    String key;
    String value;
}
