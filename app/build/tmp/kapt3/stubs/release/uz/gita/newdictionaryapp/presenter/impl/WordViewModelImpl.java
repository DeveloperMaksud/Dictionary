package uz.gita.newdictionaryapp.presenter.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Luz/gita/newdictionaryapp/presenter/impl/WordViewModelImpl;", "Luz/gita/newdictionaryapp/presenter/WordViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "cursorLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroid/database/Cursor;", "getCursorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "favouritesLiveData", "getFavouritesLiveData", "query", "", "showWordInfoLiveData", "Luz/gita/newdictionaryapp/data/room/WordData;", "getShowWordInfoLiveData", "updateItemLiveData", "", "getUpdateItemLiveData", "wordRepository", "Luz/gita/newdictionaryapp/Repository/WordRepository;", "changeFavorite", "", "wordData", "filter", "showFavourites", "showInfo", "app_release"})
public final class WordViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.newdictionaryapp.presenter.WordViewModel {
    private final uz.gita.newdictionaryapp.Repository.WordRepository wordRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<android.database.Cursor> cursorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<uz.gita.newdictionaryapp.data.room.WordData> showWordInfoLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<android.database.Cursor> favouritesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> updateItemLiveData = null;
    private java.lang.String query = "";
    
    public WordViewModelImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<android.database.Cursor> getCursorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<uz.gita.newdictionaryapp.data.room.WordData> getShowWordInfoLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<android.database.Cursor> getFavouritesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.Integer> getUpdateItemLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void showInfo(@org.jetbrains.annotations.NotNull()
    uz.gita.newdictionaryapp.data.room.WordData wordData) {
    }
    
    @java.lang.Override()
    public void changeFavorite(@org.jetbrains.annotations.NotNull()
    uz.gita.newdictionaryapp.data.room.WordData wordData) {
    }
    
    @java.lang.Override()
    public void filter(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public void showFavourites() {
    }
}