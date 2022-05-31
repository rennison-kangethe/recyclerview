package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.StudentAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.tvStudent)
        val adapter = StudentAdapter(this.genStudents())

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter.notifyDataSetChanged()
    }

    private fun genStudents() :MutableList<Student> {
     val students = mutableListOf<Student>()
        students.add(Student("222","kangethe"))
        students.add(Student("111","soi"))
        students.add(Student("333","virginia"))
        students.add(Student("222","kangethe"))
        students.add(Student("222","kangethe"))
        students.add(Student("222","kangethe"))
        students.add(Student("222","kangethe"))
        students.add(Student("222","kangethe"))
        students.add(Student("222","kangethe"))


     return students

    }
}