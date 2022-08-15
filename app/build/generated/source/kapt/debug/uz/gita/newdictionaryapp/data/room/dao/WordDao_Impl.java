package uz.gita.newdictionaryapp.data.room.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import uz.gita.newdictionaryapp.data.room.WordData;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WordDao_Impl implements WordDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WordData> __insertionAdapterOfWordData;

  private final EntityDeletionOrUpdateAdapter<WordData> __deletionAdapterOfWordData;

  private final EntityDeletionOrUpdateAdapter<WordData> __updateAdapterOfWordData;

  public WordDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWordData = new EntityInsertionAdapter<WordData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `dictionary` (`id`,`english`,`type`,`transcript`,`uzbek`,`countable`,`is_favourite`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WordData value) {
        stmt.bindLong(1, value.getId());
        if (value.getEnglish() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEnglish());
        }
        if (value.getType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getType());
        }
        if (value.getTranscript() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTranscript());
        }
        if (value.getUzbek() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUzbek());
        }
        if (value.getCountable() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCountable());
        }
        stmt.bindLong(7, value.isFavorite());
      }
    };
    this.__deletionAdapterOfWordData = new EntityDeletionOrUpdateAdapter<WordData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `dictionary` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WordData value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfWordData = new EntityDeletionOrUpdateAdapter<WordData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `dictionary` SET `id` = ?,`english` = ?,`type` = ?,`transcript` = ?,`uzbek` = ?,`countable` = ?,`is_favourite` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WordData value) {
        stmt.bindLong(1, value.getId());
        if (value.getEnglish() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEnglish());
        }
        if (value.getType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getType());
        }
        if (value.getTranscript() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTranscript());
        }
        if (value.getUzbek() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUzbek());
        }
        if (value.getCountable() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCountable());
        }
        stmt.bindLong(7, value.isFavorite());
        stmt.bindLong(8, value.getId());
      }
    };
  }

  @Override
  public void insert(final WordData wordData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWordData.insert(wordData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final WordData wordData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfWordData.handle(wordData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final WordData wordData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfWordData.handle(wordData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Cursor getEngUzCursor() {
    final String _sql = "SELECT * FROM dictionary";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public Cursor getFavorite() {
    final String _sql = "SELECT * FROM dictionary WHERE is_favourite=1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public Cursor getUzEngCursor() {
    final String _sql = "SELECT * FROM dictionary ORDER BY uzbek";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public Cursor getFilteredCursor(final String query) {
    final String _sql = "SELECT * FROM dictionary WHERE english LIKE ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
