package uz.gita.newdictionaryapp.Repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Luz/gita/newdictionaryapp/Repository/impl/WordRepositoryImpl;", "Luz/gita/newdictionaryapp/Repository/WordRepository;", "()V", "wordDao", "Luz/gita/newdictionaryapp/data/room/dao/WordDao;", "getFavourites", "Landroid/database/Cursor;", "getFilteredWordsCursor", "query", "", "getWordCursor", "update", "", "wordData", "Luz/gita/newdictionaryapp/data/room/WordData;", "app_release"})
public final class WordRepositoryImpl implements uz.gita.newdictionaryapp.Repository.WordRepository {
    private final uz.gita.newdictionaryapp.data.room.dao.WordDao wordDao = null;
    
    public WordRepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.database.Cursor getWordCursor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.database.Cursor getFilteredWordsCursor(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    uz.gita.newdictionaryapp.data.room.WordData wordData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.database.Cursor getFavourites() {
        return null;
    }
}