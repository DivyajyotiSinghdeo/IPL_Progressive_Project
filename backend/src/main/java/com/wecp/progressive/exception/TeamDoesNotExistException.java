package com.wecp.progressive.exception;

import java.sql.SQLException;

public class TeamDoesNotExistException extends SQLException {
    public TeamDoesNotExistException(String msg){
        super(msg);
    }
}