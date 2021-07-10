package com.example.todoapp.view

import android.view.View
import android.widget.CompoundButton
import com.example.todoapp.model.Todo

interface TodoCheckedChangeListener{
    fun onCheckChanged(cb: CompoundButton, isChecked:Boolean, obj:Todo)
}

interface TodoEditClickListener{
    fun onTodoEditClick(v:View)
}

interface RadioClick{
    fun onRadioClick(v:View, priority:Int, obj:Todo)
}

interface TodoSaveChangesClick{
    fun onTodoSaveChangesClick(v:View, obj:Todo)
}