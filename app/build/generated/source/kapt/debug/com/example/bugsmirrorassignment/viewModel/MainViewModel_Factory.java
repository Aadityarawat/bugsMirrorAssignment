package com.example.bugsmirrorassignment.viewModel;

import com.example.bugsmirrorassignment.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public MainViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static MainViewModel_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new MainViewModel_Factory(userRepositoryProvider);
  }

  public static MainViewModel newInstance(UserRepository userRepository) {
    return new MainViewModel(userRepository);
  }
}
