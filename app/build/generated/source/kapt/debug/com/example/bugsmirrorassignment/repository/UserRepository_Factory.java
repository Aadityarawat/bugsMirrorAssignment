package com.example.bugsmirrorassignment.repository;

import com.example.bugsmirrorassignment.room.database.UserDatabase;
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
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<UserDatabase> userDatabaseProvider;

  public UserRepository_Factory(Provider<UserDatabase> userDatabaseProvider) {
    this.userDatabaseProvider = userDatabaseProvider;
  }

  @Override
  public UserRepository get() {
    return newInstance(userDatabaseProvider.get());
  }

  public static UserRepository_Factory create(Provider<UserDatabase> userDatabaseProvider) {
    return new UserRepository_Factory(userDatabaseProvider);
  }

  public static UserRepository newInstance(UserDatabase userDatabase) {
    return new UserRepository(userDatabase);
  }
}
