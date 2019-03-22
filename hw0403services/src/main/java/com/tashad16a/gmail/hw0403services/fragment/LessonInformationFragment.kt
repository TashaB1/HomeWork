package com.tashad16a.gmail.hw0403services.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.tashad16a.gmail.hw0403services.R
import android.widget.TextView
import com.tashad16a.gmail.hw0403services.constant.ConstantName

class LessonInformationFragment : Fragment() {

    lateinit var lessonInformation: TextView
    lateinit var lessonMentorIcon: ImageView
    lateinit var lessonThemesArray: Array<String>
    var lastInfo: String? = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var informationView = inflater.inflate(R.layout.fragment_lesson_information, container, false)

        lessonInformation = informationView.findViewById(R.id.lesson_information_text_view)
        lessonMentorIcon = informationView.findViewById(R.id.lesson_information_image_view)

        lessonThemesArray = resources.getStringArray(R.array.theme_lesson)

        if (savedInstanceState != null) {
            lastInfo = savedInstanceState.getString(ConstantName.INFORMATION_KEY)
            lessonInformation.setText(lastInfo)
        }

        return informationView
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        lastInfo = lessonInformation.text.toString()
        outState.putString(ConstantName.INFORMATION_KEY, lastInfo)
    }

    fun setInformation(buttonIndex: Int) {
        val lessonInformationText = lessonThemesArray[buttonIndex - 1]
        lessonInformation.setText(lessonInformationText)
        lastInfo = lessonInformationText

        when (buttonIndex) {
            1 -> lessonMentorIcon.setImageResource(R.drawable.ic_mentor_egor)
            2 -> lessonMentorIcon.setImageResource(R.drawable.ic_mentor_mikhail)
            3 -> lessonMentorIcon.setImageResource(R.drawable.ic_mentor_egor)
            4 -> lessonMentorIcon.setImageResource(R.drawable.ic_mentor_egor)
            5 -> lessonMentorIcon.setImageResource(R.drawable.ic_mentor_mikhail)
            6 -> lessonMentorIcon.setImageResource(R.drawable.ic_mentor_egor)

            else -> {
                lessonMentorIcon.setImageResource(R.drawable.ic_person_24dp)
            }
        }
    }
}
