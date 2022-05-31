package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.Student

class StudentAdapter(private val students: MutableList<Student>)
    : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var tvName: TextView
        lateinit var tvAdminNo: TextView

        init {
            this.tvName = view.findViewById(R.id.tvName)
            this.tvAdminNo = view.findViewById(R.id.tvAdminNo)
        }

        fun populate(student: Student){
            this.tvName.setText(student.name)
            this.tvAdminNo.setText(student.adminNo)
        }

    }

    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
        holder.populate(students[position])

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        val view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.student_layout, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int = students.size

}