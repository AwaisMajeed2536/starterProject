package com.example.grapgame.starterproject.db;


import com.example.grapgame.starterproject.db.core.QueryGenerator;

/**
 * <p>Contains create queries for every table in the app.</p>
 * <p>
 * Created on 2016-12-03 14:58.
 *
 * @author M.Allaudin
 */
public class Queries {

    public static String createFeed() {
        return QueryGenerator.getInstance()
                .addIntegerPrimaryKeyAutoIncrement(DBConstants.Feed.ID)
                .addTextField(DBConstants.Feed.KEY).addTextField(DBConstants.Feed.VALUE)
                .generate(DBConstants.Feed.TABLE_NAME);
    } // createFeed

    public static String drop(String tableName) {
        return String.format("DROP TABLE IF EXISTS %s", tableName);
    } // drop

    public static String truncate(String tableName) {
        return String.format("DELETE FROM %s", tableName);
    } // truncate

} // Queries
