package uz.gita.newdictionaryapp.ui.screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020(H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006)"}, d2 = {"Luz/gita/newdictionaryapp/ui/screen/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "adapter", "Luz/gita/newdictionaryapp/ui/adapter/WordAdapter;", "getAdapter", "()Luz/gita/newdictionaryapp/ui/adapter/WordAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "buttonSpeak", "Landroid/widget/ImageView;", "emptyPlaceholder", "Landroid/view/View;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "listWords", "Landroidx/recyclerview/widget/RecyclerView;", "searchView", "Landroidx/appcompat/widget/SearchView;", "tts", "Landroid/speech/tts/TextToSpeech;", "viewModel", "Luz/gita/newdictionaryapp/presenter/WordViewModel;", "getViewModel", "()Luz/gita/newdictionaryapp/presenter/WordViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInit", "status", "", "speakOut", "text", "", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements android.speech.tts.TextToSpeech.OnInitListener {
    private androidx.recyclerview.widget.RecyclerView listWords;
    private androidx.appcompat.widget.SearchView searchView;
    private android.view.View emptyPlaceholder;
    private android.widget.ImageView buttonSpeak;
    private android.speech.tts.TextToSpeech tts;
    private final kotlin.Lazy adapter$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy handler$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final uz.gita.newdictionaryapp.ui.adapter.WordAdapter getAdapter() {
        return null;
    }
    
    private final uz.gita.newdictionaryapp.presenter.WordViewModel getViewModel() {
        return null;
    }
    
    private final android.os.Handler getHandler() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onInit(int status) {
    }
    
    private final void speakOut(java.lang.String text) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}