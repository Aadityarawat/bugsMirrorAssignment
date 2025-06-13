package com.example.bugsmirrorassignment

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.permissionchecker.AppInfo

class AppListAdapter(
    private val apps: List<AppInfo>,
    private val onClick: (String) -> Unit
) : RecyclerView.Adapter<AppListAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val icon: ImageView = view.findViewById(R.id.appIcon)
        val name: TextView = view.findViewById(R.id.appName)
        val layout: LinearLayout = view.findViewById(R.id.layout)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_app, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val app = apps[position]
        holder.name.text = app.appName
        holder.icon.setImageDrawable(app.icon as Drawable)

        holder.layout.setOnClickListener {
            onClick(app.packageName)
        }
    }

    override fun getItemCount(): Int = apps.size
}
