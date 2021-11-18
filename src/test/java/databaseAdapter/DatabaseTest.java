package databaseAdapter;

import database.БазаДаних;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database engDatabase;
    БазаДаних ukrDatabase;

    @BeforeEach
    void setUp(){
        engDatabase = new Database();
        ukrDatabase = new БазаДаних();
    }

    @Test
    void getUserData() {
        assertEquals(engDatabase.getUserData(), ukrDatabase.отриматиДаніКористувача());
    }

    @Test
    void getStaticData() {
        assertEquals(engDatabase.getStaticData(), ukrDatabase.отриматиСтатистичніДані());
    }
}