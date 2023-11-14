package com.example.listcase.domain;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.listcase.domain.auth.AccessTokenResponse;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AuthDao_Impl implements AuthDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AccessTokenResponse> __insertionAdapterOfAccessTokenResponse;

  public AuthDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAccessTokenResponse = new EntityInsertionAdapter<AccessTokenResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_tokens` (`id`,`access_token`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AccessTokenResponse value) {
        stmt.bindLong(1, value.getId());
        if (value.getAccessToken() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAccessToken());
        }
      }
    };
  }

  @Override
  public Object insertToken(final AccessTokenResponse userToken,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAccessTokenResponse.insert(userToken);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getToken(final int userId,
      final Continuation<? super AccessTokenResponse> continuation) {
    final String _sql = "SELECT * FROM user_tokens WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<AccessTokenResponse>() {
      @Override
      public AccessTokenResponse call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAccessToken = CursorUtil.getColumnIndexOrThrow(_cursor, "access_token");
          final AccessTokenResponse _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAccessToken;
            if (_cursor.isNull(_cursorIndexOfAccessToken)) {
              _tmpAccessToken = null;
            } else {
              _tmpAccessToken = _cursor.getString(_cursorIndexOfAccessToken);
            }
            _result = new AccessTokenResponse(_tmpId,_tmpAccessToken);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
