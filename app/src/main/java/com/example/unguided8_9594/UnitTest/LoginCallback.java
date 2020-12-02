package com.example.unguided8_9594.UnitTest;

import com.example.unguided8_9594.UserDAO;

public interface LoginCallback {
    void onSuccess(boolean value, UserDAO user);
    void onError();
}
