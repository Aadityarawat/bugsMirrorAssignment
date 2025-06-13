package com.example.bugsmirrorassignment.room.dao;

import android.content.Context;
import com.example.bugsmirrorassignment.room.database.UserDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class UserDaoModule_ProvidesUserDatabaseFactory implements Factory<UserDatabase> {
  private final UserDaoModule module;

  private final Provider<Context> contextProvider;

  public UserDaoModule_ProvidesUserDatabaseFactory(UserDaoModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public UserDatabase get() {
    return providesUserDatabase(module, contextProvider.get());
  }

  public static UserDaoModule_ProvidesUserDatabaseFactory create(UserDaoModule module,
      Provider<Context> contextProvider) {
    return new UserDaoModule_ProvidesUserDatabaseFactory(module, contextProvider);
  }

  public static UserDatabase providesUserDatabase(UserDaoModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providesUserDatabase(context));
  }
}
