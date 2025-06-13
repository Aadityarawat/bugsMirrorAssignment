package com.example.bugsmirrorassignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bugsmirrorassignment.databinding.ActivityMainBinding
import com.example.permissionchecker.PermissionChecker

class MainActivity : AppCompatActivity() {

    private lateinit var permissionChecker: PermissionChecker
    private lateinit var adapter: AppListAdapter
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        permissionChecker = PermissionChecker(applicationContext)

        val inputField = binding.permissionInput
        val searchButton = binding.searchButton
        val recyclerView = binding.recyclerView

        recyclerView.layoutManager = LinearLayoutManager(this)

        searchButton.setOnClickListener {
            val input = inputField.text.toString()
            val labels = input.split(",").map { it.trim() }.filter { it.isNotEmpty() }

            val apps = try {
                permissionChecker.getAppsByPermissions(labels)
            } catch (e: Exception) {
                emptyList()
            }

            adapter = AppListAdapter(apps) { packageName ->
                permissionChecker.openAppSettings(packageName)
            }
            recyclerView.adapter = adapter
        }
    }
}
