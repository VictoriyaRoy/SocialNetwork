package databaseAdapter;

import database.Авторизація;

public class Authorization extends Авторизація {
    public boolean authorize(Database db){
        return авторизуватися(db);
    }
}
