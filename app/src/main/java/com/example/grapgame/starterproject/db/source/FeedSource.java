package com.example.grapgame.starterproject.db.source;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.annotation.NonNull;

import com.example.grapgame.starterproject.db.DBConstants;
import com.example.grapgame.starterproject.db.source.core.BaseDataSource;
import com.example.grapgame.starterproject.models.FeedModel;

public class FeedSource extends BaseDataSource<FeedModel> {
    @Override
    protected void fillValues(FeedModel model, ContentValues values) {
        values.put(DBConstants.Feed.KEY, model.getKey());
        values.put(DBConstants.Feed.VALUE, model.getValue());
    }

    @NonNull
    @Override
    protected FeedModel getModelFromCursor(Cursor cursor) {
        FeedModel model = new FeedModel();
        model.setKey(cursor.getString(cursor.getColumnIndex(DBConstants.Feed.KEY)));
        model.setValue(cursor.getString(cursor.getColumnIndex(DBConstants.Feed.VALUE)));
        return model;
    }

    @Override
    protected String getTableName() {
        return DBConstants.Feed.TABLE_NAME;
    }

    @Override
    protected String getFilterKey() {
        return DBConstants.Feed.ID;
    }
}
