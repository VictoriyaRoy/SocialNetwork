package databaseAdapter;

import database.Авторизація;
import database.БазаДаних;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    Authorization engAuth;
    Авторизація ukrAuth;
    Database engDatabase;
    БазаДаних ukrDatabase;

    @BeforeEach
    void setUp(){
        engAuth = new Authorization();
        ukrAuth = new Авторизація();
        engDatabase = new Database();
        ukrDatabase = new БазаДаних();
    }

    @Test
    void authorize() {
        assertEquals(engAuth.authorize(engDatabase), ukrAuth.авторизуватися(ukrDatabase));
    }
}