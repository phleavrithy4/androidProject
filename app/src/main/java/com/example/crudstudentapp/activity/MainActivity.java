package com.example.crudstudentapp.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.crudstudentapp.R;
import com.example.crudstudentapp.adapters.CustomStudentAdapter;

public class MainActivity extends BaseActivity {
    private ListView studentListView;
    private CustomStudentAdapter customStudentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        studentListView = findViewById(R.id.ivStudent);
        customStudentAdapter = new CustomStudentAdapter(this, getAllStudent());
        studentListView.setAdapter(customStudentAdapter);
    }
}