package com.example.grapgame.starterproject.db;

/**
 * A helper class to store all database contracts in one place. Each
 * class in {@link DBConstants} represents a table will fields equal to
 * columns.
 * <p>
 * Created on 2016-12-03 14:56.
 *
 * @author M.Allaudin
 */
public class DBConstants {

    public static class Feed {
        public static final String TABLE_NAME = "feed";

        public static final String ID = "id";
        public static final String KEY = "key";
        public static final String VALUE = "value";
    }//Feed

} // DBConstants
