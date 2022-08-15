package uz.gita.newdictionaryapp.data.room.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\b\u0010\b\u001a\u00020\u0007H\'J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\'J\b\u0010\f\u001a\u00020\u0007H\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Luz/gita/newdictionaryapp/data/room/dao/WordDao;", "", "delete", "", "wordData", "Luz/gita/newdictionaryapp/data/room/WordData;", "getEngUzCursor", "Landroid/database/Cursor;", "getFavorite", "getFilteredCursor", "query", "", "getUzEngCursor", "insert", "update", "app_debug"})
public abstract interface WordDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    uz.gita.newdictionaryapp.data.room.WordData wordData);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    uz.gita.newdictionaryapp.data.room.WordData wordData);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    uz.gita.newdictionaryapp.data.room.WordData wordData);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM dictionary")
    public abstract android.database.Cursor getEngUzCursor();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM dictionary WHERE is_favourite=1")
    public abstract android.database.Cursor getFavorite();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM dictionary ORDER BY uzbek")
    public abstract android.database.Cursor getUzEngCursor();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM dictionary WHERE english LIKE :query || \'%\'")
    public abstract android.database.Cursor getFilteredCursor(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
}