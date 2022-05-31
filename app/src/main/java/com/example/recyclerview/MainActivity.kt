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
        students.add(Student("345","Rennison"))
        students.add(Student("256","soi"))
        students.add(Student("372","eric"))
        students.add(Student("222","steve"))
        students.add(Student("287","mike"))
        students.add(Student("111","gladys"))
        students.add(Student("000","peter"))
        students.add(Student("890","mish"))
        students.add(Student("754","edrin"))


     return students

    }
}