package me.magnum.melonds.ui.common.componentbuilders

import android.content.Context
import android.view.View
import android.widget.ImageView
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.layout.LayoutComponent
import me.magnum.melonds.ui.common.LayoutComponentViewBuilder

class SingleButtonLayoutComponentViewBuilder(private val layoutComponent: LayoutComponent) : LayoutComponentViewBuilder() {
    override fun build(context: Context): View {
        return ImageView(context).apply {
            setImageResource(getInputDrawable())
        }
    }

    override fun getAspectRatio() = 1f

    private fun getInputDrawable(): Int {
        return when (layoutComponent) {
            LayoutComponent.BUTTON_L -> R.drawable.button_l
            LayoutComponent.BUTTON_R -> R.drawable.button_r
            LayoutComponent.BUTTON_START -> R.drawable.button_start
            LayoutComponent.BUTTON_SELECT -> R.drawable.button_select
            LayoutComponent.BUTTON_HINGE -> R.drawable.button_toggle_lid
            LayoutComponent.BUTTON_PAUSE -> R.drawable.button_pause
            LayoutComponent.BUTTON_FAST_FORWARD_TOGGLE -> R.drawable.button_fast_forward
            LayoutComponent.BUTTON_TOGGLE_SOFT_INPUT -> R.drawable.ic_touch_enabled
            LayoutComponent.BUTTON_RESET -> R.drawable.button_reset
            LayoutComponent.BUTTON_SWAP_SCREENS -> R.drawable.button_swap_screens
            LayoutComponent.BUTTON_QUICK_SAVE -> R.drawable.button_quick_save
            LayoutComponent.BUTTON_QUICK_LOAD -> R.drawable.button_quick_load
            LayoutComponent.BUTTON_REWIND -> R.drawable.button_rewind
            LayoutComponent.BUTTON_MICROPHONE_TOGGLE -> R.drawable.button_microphone
            // TAS buttons
            LayoutComponent.BUTTON_FRAME_ADVANCE -> R.drawable.button_frame_advance
            LayoutComponent.BUTTON_TAS_PAUSE -> R.drawable.button_tas_pause
            LayoutComponent.BUTTON_TAS_RESUME -> R.drawable.button_tas_resume
            LayoutComponent.BUTTON_RECORD_INPUT -> R.drawable.button_record_input
            LayoutComponent.BUTTON_PLAYBACK_INPUT -> R.drawable.button_playback_input
            // Save/Load slot buttons
            LayoutComponent.BUTTON_SAVE_SLOT_1,
            LayoutComponent.BUTTON_SAVE_SLOT_2,
            LayoutComponent.BUTTON_SAVE_SLOT_3,
            LayoutComponent.BUTTON_SAVE_SLOT_4,
            LayoutComponent.BUTTON_SAVE_SLOT_5,
            LayoutComponent.BUTTON_SAVE_SLOT_6,
            LayoutComponent.BUTTON_SAVE_SLOT_7,
            LayoutComponent.BUTTON_SAVE_SLOT_8,
            LayoutComponent.BUTTON_SAVE_SLOT_9 -> R.drawable.button_save_slot
            LayoutComponent.BUTTON_LOAD_SLOT_1,
            LayoutComponent.BUTTON_LOAD_SLOT_2,
            LayoutComponent.BUTTON_LOAD_SLOT_3,
            LayoutComponent.BUTTON_LOAD_SLOT_4,
            LayoutComponent.BUTTON_LOAD_SLOT_5,
            LayoutComponent.BUTTON_LOAD_SLOT_6,
            LayoutComponent.BUTTON_LOAD_SLOT_7,
            LayoutComponent.BUTTON_LOAD_SLOT_8,
            LayoutComponent.BUTTON_LOAD_SLOT_9 -> R.drawable.button_load_slot
            else -> -1
        }
    }
}