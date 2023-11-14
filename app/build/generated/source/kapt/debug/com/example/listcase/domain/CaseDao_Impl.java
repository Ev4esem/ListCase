package com.example.listcase.domain;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.listcase.domain.extities.CaseImportance;
import com.example.listcase.domain.extities.TodoItem;
import java.lang.Class;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CaseDao_Impl implements CaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TodoItem> __insertionAdapterOfTodoItem;

  private final EntityDeletionOrUpdateAdapter<TodoItem> __updateAdapterOfTodoItem;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTodo;

  public CaseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTodoItem = new EntityInsertionAdapter<TodoItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `todo_item` (`id`,`name`,`item_checked`,`time`,`importance`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TodoItem value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final int _tmp = value.getItemChecked() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getTime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTime());
        }
        if (value.getImportance() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, __CaseImportance_enumToString(value.getImportance()));
        }
      }
    };
    this.__updateAdapterOfTodoItem = new EntityDeletionOrUpdateAdapter<TodoItem>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `todo_item` SET `id` = ?,`name` = ?,`item_checked` = ?,`time` = ?,`importance` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TodoItem value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final int _tmp = value.getItemChecked() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getTime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTime());
        }
        if (value.getImportance() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, __CaseImportance_enumToString(value.getImportance()));
        }
        stmt.bindLong(6, value.getId());
      }
    };
    this.__preparedStmtOfDeleteTodo = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM todo_item WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertTodo(final TodoItem itemTodo, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTodoItem.insert(itemTodo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateTodo(final TodoItem caseItem, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTodoItem.handle(caseItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteTodo(final long caseId, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTodo.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, caseId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteTodo.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<TodoItem>> getAllTodo() {
    final String _sql = "SELECT * FROM todo_item";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"todo_item"}, new Callable<List<TodoItem>>() {
      @Override
      public List<TodoItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfItemChecked = CursorUtil.getColumnIndexOrThrow(_cursor, "item_checked");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final List<TodoItem> _result = new ArrayList<TodoItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TodoItem _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final boolean _tmpItemChecked;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfItemChecked);
            _tmpItemChecked = _tmp != 0;
            final String _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getString(_cursorIndexOfTime);
            }
            final CaseImportance _tmpImportance;
            _tmpImportance = __CaseImportance_stringToEnum(_cursor.getString(_cursorIndexOfImportance));
            _item = new TodoItem(_tmpId,_tmpName,_tmpItemChecked,_tmpTime,_tmpImportance);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<TodoItem> getCaseById(final long caseId) {
    final String _sql = "SELECT * FROM todo_item WHERE id = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, caseId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"todo_item"}, false, new Callable<TodoItem>() {
      @Override
      public TodoItem call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfItemChecked = CursorUtil.getColumnIndexOrThrow(_cursor, "item_checked");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final TodoItem _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final boolean _tmpItemChecked;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfItemChecked);
            _tmpItemChecked = _tmp != 0;
            final String _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getString(_cursorIndexOfTime);
            }
            final CaseImportance _tmpImportance;
            _tmpImportance = __CaseImportance_stringToEnum(_cursor.getString(_cursorIndexOfImportance));
            _result = new TodoItem(_tmpId,_tmpName,_tmpItemChecked,_tmpTime,_tmpImportance);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private String __CaseImportance_enumToString(final CaseImportance _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case HIGH: return "HIGH";
      case LOW: return "LOW";
      case NORMAL: return "NORMAL";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
  }

  private CaseImportance __CaseImportance_stringToEnum(final String _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case "HIGH": return CaseImportance.HIGH;
      case "LOW": return CaseImportance.LOW;
      case "NORMAL": return CaseImportance.NORMAL;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }
}
