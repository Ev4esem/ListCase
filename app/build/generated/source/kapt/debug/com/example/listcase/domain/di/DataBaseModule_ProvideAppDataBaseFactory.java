package com.example.listcase.domain.di;

import android.content.Context;
import com.example.listcase.domain.MainDataBase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.example.listcase.domain.di.AppScope")
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
public final class DataBaseModule_ProvideAppDataBaseFactory implements Factory<MainDataBase> {
  private final DataBaseModule module;

  private final Provider<Context> contextProvider;

  public DataBaseModule_ProvideAppDataBaseFactory(DataBaseModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public MainDataBase get() {
    return provideAppDataBase(module, contextProvider.get());
  }

  public static DataBaseModule_ProvideAppDataBaseFactory create(DataBaseModule module,
      Provider<Context> contextProvider) {
    return new DataBaseModule_ProvideAppDataBaseFactory(module, contextProvider);
  }

  public static MainDataBase provideAppDataBase(DataBaseModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideAppDataBase(context));
  }
}
