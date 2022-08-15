package uz.gita.newdictionaryapp.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Luz/gita/newdictionaryapp/Repository/WordRepository;", "", "getFavourites", "Landroid/database/Cursor;", "getFilteredWordsCursor", "query", "", "getWordCursor", "update", "", "wordData", "Luz/gita/newdictionaryapp/data/room/WordData;", "app_debug"})
public abstract interface WordRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor getWordCursor();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor getFilteredWordsCursor(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    uz.gita.newdictionaryapp.data.room.WordData wordData);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor getFavourites();
}