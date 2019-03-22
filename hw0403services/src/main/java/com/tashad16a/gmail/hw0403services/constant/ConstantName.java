package com.tashad16a.gmail.hw0403services.constant;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@StringDef({
        ConstantName.LESSON_PROGRESS,
        ConstantName.MESSAGE_START,
        ConstantName.MESSAGE_KEY,
        ConstantName.INFORMATION_KEY
})
public @interface ConstantName {

    public static final String LESSON_PROGRESS = "com.tashad16a.gmail.action.FILTER";
    public static final String MESSAGE_START = "Идет загрузка!";
    public static final String MESSAGE_KEY = "MESSAGE";
    public static final String INFORMATION_KEY = "INFORMATOIN";
}

