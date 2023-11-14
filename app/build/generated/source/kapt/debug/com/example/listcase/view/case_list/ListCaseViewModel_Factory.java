package com.example.listcase.view.case_list;

import com.example.listcase.domain.repository.CaseRepository;
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
public final class ListCaseViewModel_Factory {
  private final Provider<CaseRepository> repositoryProvider;

  public ListCaseViewModel_Factory(Provider<CaseRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public ListCaseViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ListCaseViewModel_Factory create(Provider<CaseRepository> repositoryProvider) {
    return new ListCaseViewModel_Factory(repositoryProvider);
  }

  public static ListCaseViewModel newInstance(CaseRepository repository) {
    return new ListCaseViewModel(repository);
  }
}
