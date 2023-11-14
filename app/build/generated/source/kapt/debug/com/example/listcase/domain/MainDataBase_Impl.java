package com.example.listcase.domain;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MainDataBase_Impl extends MainDataBase {
  private volatile CaseDao _caseDao;

  private volatile AuthDao _authDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `todo_item` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `item_checked` INTEGER NOT NULL, `time` TEXT NOT NULL, `importance` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user_tokens` (`id` INTEGER NOT NULL, `access_token` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ad01281670eb10fda3da7c3837d22346')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `todo_item`");
        _db.execSQL("DROP TABLE IF EXISTS `user_tokens`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTodoItem = new HashMap<String, TableInfo.Column>(5);
        _columnsTodoItem.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTodoItem.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTodoItem.put("item_checked", new TableInfo.Column("item_checked", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTodoItem.put("time", new TableInfo.Column("time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTodoItem.put("importance", new TableInfo.Column("importance", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTodoItem = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTodoItem = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTodoItem = new TableInfo("todo_item", _columnsTodoItem, _foreignKeysTodoItem, _indicesTodoItem);
        final TableInfo _existingTodoItem = TableInfo.read(_db, "todo_item");
        if (! _infoTodoItem.equals(_existingTodoItem)) {
          return new RoomOpenHelper.ValidationResult(false, "todo_item(com.example.listcase.domain.extities.TodoItem).\n"
                  + " Expected:\n" + _infoTodoItem + "\n"
                  + " Found:\n" + _existingTodoItem);
        }
        final HashMap<String, TableInfo.Column> _columnsUserTokens = new HashMap<String, TableInfo.Column>(2);
        _columnsUserTokens.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTokens.put("access_token", new TableInfo.Column("access_token", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserTokens = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserTokens = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserTokens = new TableInfo("user_tokens", _columnsUserTokens, _foreignKeysUserTokens, _indicesUserTokens);
        final TableInfo _existingUserTokens = TableInfo.read(_db, "user_tokens");
        if (! _infoUserTokens.equals(_existingUserTokens)) {
          return new RoomOpenHelper.ValidationResult(false, "user_tokens(com.example.listcase.domain.auth.AccessTokenResponse).\n"
                  + " Expected:\n" + _infoUserTokens + "\n"
                  + " Found:\n" + _existingUserTokens);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ad01281670eb10fda3da7c3837d22346", "9da58346a2371fd05638c5249147a70b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "todo_item","user_tokens");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `todo_item`");
      _db.execSQL("DELETE FROM `user_tokens`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CaseDao.class, CaseDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(AuthDao.class, AuthDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public CaseDao getDao() {
    if (_caseDao != null) {
      return _caseDao;
    } else {
      synchronized(this) {
        if(_caseDao == null) {
          _caseDao = new CaseDao_Impl(this);
        }
        return _caseDao;
      }
    }
  }

  @Override
  public AuthDao authDao() {
    if (_authDao != null) {
      return _authDao;
    } else {
      synchronized(this) {
        if(_authDao == null) {
          _authDao = new AuthDao_Impl(this);
        }
        return _authDao;
      }
    }
  }
}
