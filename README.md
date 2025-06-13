I created an Android library module named PermissionChecker. It includes a PermissionChecker class that can list all installed apps on the device that request specific permissions. It also has a data class AppInfo to hold app details like name, package name, and icon.

After building the module into an .aar file, I added it as a dependency in the host app's build.gradle file.

In the host app's MainActivity, there’s an EditText to enter one or more permissions (separated by commas), a Search button to trigger the check, and a RecyclerView to display the list of matching apps.

I also created an AppListAdapter for the RecyclerView, which includes a click listener to open the selected app’s settings screen directly.
