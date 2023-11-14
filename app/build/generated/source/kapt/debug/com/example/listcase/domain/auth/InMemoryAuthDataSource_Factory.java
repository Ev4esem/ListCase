package com.example.listcase.domain.auth;

import com.example.listcase.domain.MainDataBase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InMemoryAuthDataSource_Factory implements Factory<InMemoryAuthDataSource> {
  private final Provider<MainDataBase> dataBaseProvider;

  public InMemoryAuthDataSource_Factory(Provider<MainDataBase> dataBaseProvider) {
    this.dataBaseProvider = dataBaseProvider;
  }

  @Override
  public InMemoryAuthDataSource get() {
    return newInstance(dataBaseProvider.get());
  }

  public static InMemoryAuthDataSource_Factory create(Provider<MainDataBase> dataBaseProvider) {
    return new InMemoryAuthDataSource_Factory(dataBaseProvider);
  }

  public static InMemoryAuthDataSource newInstance(MainDataBase dataBase) {
    return new InMemoryAuthDataSource(dataBase);
  }
}
