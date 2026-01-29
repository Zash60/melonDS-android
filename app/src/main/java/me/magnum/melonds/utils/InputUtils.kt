package me.magnum.melonds.utils

import me.magnum.melonds.R
import me.magnum.melonds.domain.model.layout.LayoutComponent

fun getLayoutComponentName(layoutComponent: LayoutComponent): Int {
    return when (layoutComponent) {
        LayoutComponent.TOP_SCREEN -> R.string.top_screen
        LayoutComponent.BOTTOM_SCREEN -> R.string.bottom_screen
        LayoutComponent.DPAD -> R.string.input_dpad
        LayoutComponent.BUTTONS -> R.string.input_abxy_buttons
        LayoutComponent.BUTTON_L -> R.string.input_l
        LayoutComponent.BUTTON_R -> R.string.input_r
        LayoutComponent.BUTTON_START -> R.string.input_start
        LayoutComponent.BUTTON_SELECT -> R.string.input_select
        LayoutComponent.BUTTON_HINGE -> R.string.input_lid
        LayoutComponent.BUTTON_PAUSE -> R.string.input_pause
        LayoutComponent.BUTTON_FAST_FORWARD_TOGGLE -> R.string.input_fast_forward
        LayoutComponent.BUTTON_MICROPHONE_TOGGLE -> R.string.input_microphone
        LayoutComponent.BUTTON_TOGGLE_SOFT_INPUT -> R.string.input_toggle_soft_input
        LayoutComponent.BUTTON_RESET -> R.string.reset
        LayoutComponent.BUTTON_SWAP_SCREENS -> R.string.input_swap_screens
        LayoutComponent.BUTTON_QUICK_SAVE -> R.string.input_quick_save
        LayoutComponent.BUTTON_QUICK_LOAD -> R.string.input_quick_load
        LayoutComponent.BUTTON_REWIND -> R.string.rewind
        // TAS Layout Components
        LayoutComponent.BUTTON_FRAME_ADVANCE -> R.string.input_frame_advance
        LayoutComponent.BUTTON_TAS_PAUSE -> R.string.input_tas_pause
        LayoutComponent.BUTTON_TAS_RESUME -> R.string.input_tas_resume
        LayoutComponent.BUTTON_RECORD_INPUT -> R.string.input_record_input
        LayoutComponent.BUTTON_PLAYBACK_INPUT -> R.string.input_playback_input
        LayoutComponent.FRAME_COUNTER_DISPLAY -> R.string.input_frame_counter
        // Save/Load Slot Layout Components
        LayoutComponent.BUTTON_SAVE_SLOT_1 -> R.string.input_save_slot_1
        LayoutComponent.BUTTON_SAVE_SLOT_2 -> R.string.input_save_slot_2
        LayoutComponent.BUTTON_SAVE_SLOT_3 -> R.string.input_save_slot_3
        LayoutComponent.BUTTON_SAVE_SLOT_4 -> R.string.input_save_slot_4
        LayoutComponent.BUTTON_SAVE_SLOT_5 -> R.string.input_save_slot_5
        LayoutComponent.BUTTON_SAVE_SLOT_6 -> R.string.input_save_slot_6
        LayoutComponent.BUTTON_SAVE_SLOT_7 -> R.string.input_save_slot_7
        LayoutComponent.BUTTON_SAVE_SLOT_8 -> R.string.input_save_slot_8
        LayoutComponent.BUTTON_SAVE_SLOT_9 -> R.string.input_save_slot_9
        LayoutComponent.BUTTON_LOAD_SLOT_1 -> R.string.input_load_slot_1
        LayoutComponent.BUTTON_LOAD_SLOT_2 -> R.string.input_load_slot_2
        LayoutComponent.BUTTON_LOAD_SLOT_3 -> R.string.input_load_slot_3
        LayoutComponent.BUTTON_LOAD_SLOT_4 -> R.string.input_load_slot_4
        LayoutComponent.BUTTON_LOAD_SLOT_5 -> R.string.input_load_slot_5
        LayoutComponent.BUTTON_LOAD_SLOT_6 -> R.string.input_load_slot_6
        LayoutComponent.BUTTON_LOAD_SLOT_7 -> R.string.input_load_slot_7
        LayoutComponent.BUTTON_LOAD_SLOT_8 -> R.string.input_load_slot_8
        LayoutComponent.BUTTON_LOAD_SLOT_9 -> R.string.input_load_slot_9
    }
}