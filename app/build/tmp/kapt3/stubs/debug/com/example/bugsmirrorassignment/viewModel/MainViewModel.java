package com.example.bugsmirrorassignment.viewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/bugsmirrorassignment/viewModel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/example/bugsmirrorassignment/repository/UserRepository;", "(Lcom/example/bugsmirrorassignment/repository/UserRepository;)V", "getUser", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/bugsmirrorassignment/room/entities/User;", "insertUser", "", "user", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.bugsmirrorassignment.repository.UserRepository userRepository = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.bugsmirrorassignment.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.bugsmirrorassignment.room.entities.User>> getUser() {
        return null;
    }
    
    public final void insertUser(@org.jetbrains.annotations.NotNull()
    com.example.bugsmirrorassignment.room.entities.User user) {
    }
}