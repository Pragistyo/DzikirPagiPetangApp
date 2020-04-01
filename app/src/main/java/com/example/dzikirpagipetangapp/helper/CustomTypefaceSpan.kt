package com.example.dzikirpagipetangapp.helper

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan
import android.text.style.TypefaceSpan;

class CustomTypefaceSpan(typeface:Typeface): MetricAffectingSpan() {
    private val typeface:Typeface
    init{
        this.typeface = typeface
    }
    override fun updateDrawState(ds:TextPaint) {
        applyCustomTypeFace(ds, typeface)
    }
    override fun updateMeasureState(paint:TextPaint) {
        applyCustomTypeFace(paint, typeface)
    }
    private fun applyCustomTypeFace(paint:Paint, tf:Typeface) {
        paint.setTypeface(tf)
    }
}