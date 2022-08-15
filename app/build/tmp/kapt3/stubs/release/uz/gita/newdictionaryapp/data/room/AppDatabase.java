package uz.gita.newdictionaryapp.data.room;

import java.lang.System;

@androidx.room.Database(entities = {uz.gita.newdictionaryapp.data.room.WordData.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Luz/gita/newdictionaryapp/data/room/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getWordDao", "Luz/gita/newdictionaryapp/data/room/dao/WordDao;", "Companion", "app_release"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final uz.gita.newdictionaryapp.data.room.AppDatabase.Companion Companion = null;
    private static uz.gita.newdictionaryapp.data.room.AppDatabase INSTANCE;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract uz.gita.newdictionaryapp.data.room.dao.WordDao getWordDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Luz/gita/newdictionaryapp/data/room/AppDatabase$Companion;", "", "()V", "INSTANCE", "Luz/gita/newdictionaryapp/data/room/AppDatabase;", "instance", "getInstance", "()Luz/gita/newdictionaryapp/data/room/AppDatabase;", "init", "", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void init(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final uz.gita.newdictionaryapp.data.room.AppDatabase getInstance() {
            return null;
        }
    }
}