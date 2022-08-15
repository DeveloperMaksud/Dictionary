package uz.gita.newdictionaryapp.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\t2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u001a\u0010\u0015\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u001a\u0010\u0017\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u001a\u0010\u0018\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u000e\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Luz/gita/newdictionaryapp/ui/adapter/WordAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Luz/gita/newdictionaryapp/ui/adapter/WordAdapter$WordItemViewHolder;", "()V", "cursor", "Landroid/database/Cursor;", "favouriteClickListener", "Lkotlin/Function1;", "Luz/gita/newdictionaryapp/data/room/WordData;", "", "itemClickListener", "voiceClickListener", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFavouriteClickListener", "block", "setItemClickListener", "setVoiceClickListener", "submitCursor", "WordItemViewHolder", "app_debug"})
public final class WordAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<uz.gita.newdictionaryapp.ui.adapter.WordAdapter.WordItemViewHolder> {
    private android.database.Cursor cursor;
    private kotlin.jvm.functions.Function1<? super uz.gita.newdictionaryapp.data.room.WordData, kotlin.Unit> itemClickListener;
    private kotlin.jvm.functions.Function1<? super uz.gita.newdictionaryapp.data.room.WordData, kotlin.Unit> favouriteClickListener;
    private kotlin.jvm.functions.Function1<? super uz.gita.newdictionaryapp.data.room.WordData, kotlin.Unit> voiceClickListener;
    
    public WordAdapter() {
        super();
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super uz.gita.newdictionaryapp.data.room.WordData, kotlin.Unit> block) {
    }
    
    public final void setFavouriteClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super uz.gita.newdictionaryapp.data.room.WordData, kotlin.Unit> block) {
    }
    
    public final void setVoiceClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super uz.gita.newdictionaryapp.data.room.WordData, kotlin.Unit> block) {
    }
    
    public final void submitCursor(@org.jetbrains.annotations.NotNull()
    android.database.Cursor cursor) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public uz.gita.newdictionaryapp.ui.adapter.WordAdapter.WordItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    uz.gita.newdictionaryapp.ui.adapter.WordAdapter.WordItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Luz/gita/newdictionaryapp/ui/adapter/WordAdapter$WordItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Luz/gita/newdictionaryapp/ui/adapter/WordAdapter;Landroid/view/View;)V", "btnStar", "Landroid/widget/ImageButton;", "btnvoise", "txtWord", "Landroid/widget/TextView;", "bind", "", "app_debug"})
    public final class WordItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView txtWord = null;
        private final android.widget.ImageButton btnStar = null;
        private final android.widget.ImageButton btnvoise = null;
        
        public WordItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bind() {
        }
    }
}