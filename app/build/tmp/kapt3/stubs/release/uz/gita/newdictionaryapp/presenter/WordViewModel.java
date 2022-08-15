package uz.gita.newdictionaryapp.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0010H&J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Luz/gita/newdictionaryapp/presenter/WordViewModel;", "", "cursorLiveData", "Landroidx/lifecycle/LiveData;", "Landroid/database/Cursor;", "getCursorLiveData", "()Landroidx/lifecycle/LiveData;", "favouritesLiveData", "getFavouritesLiveData", "showWordInfoLiveData", "Luz/gita/newdictionaryapp/data/room/WordData;", "getShowWordInfoLiveData", "updateItemLiveData", "", "getUpdateItemLiveData", "changeFavorite", "", "wordData", "filter", "query", "", "showFavourites", "showInfo", "app_release"})
public abstract interface WordViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<android.database.Cursor> getCursorLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<uz.gita.newdictionaryapp.data.room.WordData> getShowWordInfoLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<android.database.Cursor> getFavouritesLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getUpdateItemLiveData();
    
    public abstract void showInfo(@org.jetbrains.annotations.NotNull()
    uz.gita.newdictionaryapp.data.room.WordData wordData);
    
    public abstract void changeFavorite(@org.jetbrains.annotations.NotNull()
    uz.gita.newdictionaryapp.data.room.WordData wordData);
    
    public abstract void filter(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    public abstract void showFavourites();
}