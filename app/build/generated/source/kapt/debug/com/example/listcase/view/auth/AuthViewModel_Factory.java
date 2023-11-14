package com.example.listcase.view.auth;

import com.example.listcase.domain.auth.AuthRepository;
import dagger.internal.DaggerGenerated;
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
public final class AuthViewModel_Factory {
  private final Provider<AuthRepository> repositoryProvider;

  public AuthViewModel_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public AuthViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static AuthViewModel_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new AuthViewModel_Factory(repositoryProvider);
  }

  public static AuthViewModel newInstance(AuthRepository repository) {
    return new AuthViewModel(repository);
  }
}
