package com.example.dzikirpagipetangapp

import android.os.Build
import android.text.Html
import android.text.Spanned
import android.widget.TextView

fun String.toHtml(): Spanned
{
    val result: Spanned = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY)
    } else {
        Html.fromHtml(this)
    }
    return result
}

fun TextView.setHtmlText(text: String){
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        setText(Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY))
    } else {
        setText(Html.fromHtml(text))
    }
}

fun String.htmlConvert(text: String):Spanned{
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        return Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY)
    } else {
        return Html.fromHtml(text)
    }
}