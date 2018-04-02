package com.example.grapgame.starterproject.services.core;


import com.example.grapgame.starterproject.helpers.Constants;

import java.io.IOException;

public class NoInternetException extends IOException {
    @Override
    public String getMessage() {
        return Constants.ERROR_INTERNET_CONNECTION;
    }

}