package com.angular.be.angularbe.exception;

import lombok.ToString;

import java.util.Date;


@ToString
public class APIErrorBuilder {

    private static final Integer NOT_FOUND_STATUS = 404;
    private static final Integer INTERNAL_SERVER_ERROR = 500;
    private static final Integer BAD_REQUEST = 400;
    private static final Integer CONFLICT = 409;
    private static final Integer GONE = 401;

    public static ResponseAPIErrorDTO notFound(String p_Message) {
        return new ResponseAPIErrorDTO(
                new Date(),
                NOT_FOUND_STATUS,
                p_Message,
                "Not Found"
        );
    }


    public static ResponseAPIErrorDTO conflict(Class p_Exception, String p_Message, String p_Path) {
        return new ResponseAPIErrorDTO(
                new Date(),
                CONFLICT,
                p_Message,
                "Conflict"
        );
    }

    public static ResponseAPIErrorDTO internalServerError(Class p_Exception, String p_Message, String p_Path) {
        return new ResponseAPIErrorDTO(
                new Date(),
                INTERNAL_SERVER_ERROR,
                p_Message,
                "Internal Server Error"
        );
    }

    public static ResponseAPIErrorDTO badRequest(Class p_Exception, String p_Message, String p_Path) {
        return new ResponseAPIErrorDTO(
                new Date(),
                BAD_REQUEST,
                p_Message,
                "Bad Request"
        );
    }

    public static ResponseAPIErrorDTO gone(Class p_Exception, String p_Message, String p_Path) {
        return new ResponseAPIErrorDTO(
                new Date(),
                GONE,
                p_Message,
                "Gone"
        );
    }
}
