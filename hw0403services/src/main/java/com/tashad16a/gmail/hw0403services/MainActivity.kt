package com.tashad16a.gmail.hw0403services

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tashad16a.gmail.hw0403services.fragment.LessonInformationFragment
import com.tashad16a.gmail.hw0403services.fragment.LessonSelectionFragment

class MainActivity : AppCompatActivity() , LessonSelectionFragment.OnSelectedButtonListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    override fun onButtonSelected(buttonIndex: Int) {

        val fragmentManager = supportFragmentManager

        // Получаем ссылку на второй фрагмент по ID
        var lessonInformationFragment = LessonInformationFragment()
        var lessonSelectionFragment = LessonSelectionFragment()

         lessonInformationFragment = fragmentManager.findFragmentById(R.id.lesson_information_fragment) as LessonInformationFragment

        // Выводим нужную информацию
        if (lessonInformationFragment != null)
            lessonInformationFragment.setInformation(buttonIndex)
    }
}
