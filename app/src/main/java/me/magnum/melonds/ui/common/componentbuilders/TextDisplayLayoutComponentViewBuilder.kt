package me.magnum.melonds.ui.common.componentbuilders

import android.content.Context
import android.view.View
import android.widget.TextView
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.layout.LayoutComponent
import me.magnum.melonds.ui.common.LayoutComponentViewBuilder

class TextDisplayLayoutComponentViewBuilder(private val layoutComponent: LayoutComponent) : LayoutComponentViewBuilder() {
    override fun build(context: Context): View {
        return TextView(context).apply {
            setTextColor(android.graphics.Color.WHITE)
            textSize = 16f
            setBackgroundResource(R.drawable.frame_counter_background)
            gravity = android.view.Gravity.CENTER
            text = "Frame: 0"
        }
    }

    override fun getAspectRatio() = 3.33f
}
