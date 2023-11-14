package com.example.listcase.domain.repository;

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
public final class InMemoryCaseDataSource_Factory implements Factory<InMemoryCaseDataSource> {
  private final Provider<MainDataBase> dataBaseProvider;

  public InMemoryCaseDataSource_Factory(Provider<MainDataBase> dataBaseProvider) {
    this.dataBaseProvider = dataBaseProvider;
  }

  @Override
  public InMemoryCaseDataSource get() {
    return newInstance(dataBaseProvider.get());
  }

  public static InMemoryCaseDataSource_Factory create(Provider<MainDataBase> dataBaseProvider) {
    return new InMemoryCaseDataSource_Factory(dataBaseProvider);
  }

  public static InMemoryCaseDataSource newInstance(MainDataBase dataBase) {
    return new InMemoryCaseDataSource(dataBase);
  }
}
