package com.tashad16a.gmail.hw0403services.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.tashad16a.gmail.hw0403services.R
import android.widget.TextView

class LessonInformationFragment : Fragment() {

    lateinit var lessonInformation: TextView
    lateinit var lessonMentorIcon: ImageView
    lateinit var informationView: View
    lateinit var lessonThemesArray: Array<String>
    var lastInfo: String? = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        informationView = inflater.inflate(R.layout.fragment_lesson_information, container, false)

        lessonInformation = informationView.findViewById(R.id.lesson_information_text_view)
        lessonMentorIcon = informationView.findViewById(R.id.lesson_information_image_view)

        lessonThemesArray = resources.getStringArray(R.array.theme_lesson)

        if (savedInstanceState != null) {
            lastInfo = savedInstanceState.getString("INFORMATION")
            lessonInformation.setText(lastInfo)
        }

        return informationView
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        lastInfo = lessonInformation.text.toString()
        outState.putString("INFORMATION", lastInfo)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
    }

    override fun setRetainInstance(retain: Boolean) {
        super.setRetainInstance(retain)
    }

    fun setImage(lessonMentorIcon: ImageView) {
        this.lessonMentorIcon = lessonMentorIcon
    }

    fun getImage(): ImageView {
        return this.lessonMentorIcon
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
