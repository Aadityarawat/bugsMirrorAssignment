package com.example.permissionchecker

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.Settings

data class AppInfo(
    val packageName: String,
    val appName: String,
    val icon: Any?
)

class PermissionChecker(private val context: Context) {

    private val permissionMap = mapOf(
        "Access to Camera" to android.Manifest.permission.CAMERA,
        "Access to Location" to android.Manifest.permission.ACCESS_FINE_LOCATION,
        "Access to Contacts" to android.Manifest.permission.READ_CONTACTS,
        "Access to Microphone" to android.Manifest.permission.RECORD_AUDIO,
        "Access to Storage" to android.Manifest.permission.READ_EXTERNAL_STORAGE,
        "Access to SMS" to android.Manifest.permission.READ_SMS
    )

    fun getAppsByPermissions(userFriendlyPermissions: List<String>): List<AppInfo> {
        val pm = context.packageManager
        val apps = mutableListOf<AppInfo>()

        val androidPermissions = userFriendlyPermissions.mapNotNull { permissionMap[it] }

        if (androidPermissions.isEmpty()) return emptyList()

        val packages = pm.getInstalledPackages(PackageManager.GET_PERMISSIONS)

        for (pkg in packages) {
            val requestedPermissions = pkg.requestedPermissions?.toSet() ?: continue
            if (androidPermissions.any { it in requestedPermissions }) {
                val appName = pkg.applicationInfo?.loadLabel(pm).toString()
                val icon = pkg.applicationInfo?.loadIcon(pm)
                apps.add(AppInfo(pkg.packageName, appName, icon))
            }
        }
        return apps
    }

    fun openAppSettings(packageName: String) {
        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
            data = Uri.parse("package:$packageName")
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context.startActivity(intent)
    }
}
