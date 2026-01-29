package me.magnum.melonds.domain.model.layout

import me.magnum.melonds.domain.model.Input

enum class LayoutComponent(val matchingInputs: List<Input>) {
    TOP_SCREEN(emptyList()),
    BOTTOM_SCREEN(emptyList()),
    DPAD(listOf(Input.UP, Input.DOWN, Input.LEFT, Input.RIGHT)),
    BUTTONS(listOf(Input.A, Input.B, Input.X, Input.Y)),
    BUTTON_START(listOf(Input.START)),
    BUTTON_SELECT(listOf(Input.SELECT)),
    BUTTON_L(listOf(Input.L)),
    BUTTON_R(listOf(Input.R)),
    BUTTON_HINGE(listOf(Input.HINGE)),
    BUTTON_FAST_FORWARD_TOGGLE(listOf(Input.FAST_FORWARD)),
    BUTTON_TOGGLE_SOFT_INPUT(listOf(Input.TOGGLE_SOFT_INPUT)),
    BUTTON_RESET(listOf(Input.RESET)),
    BUTTON_PAUSE(listOf(Input.PAUSE)),
    BUTTON_SWAP_SCREENS(listOf(Input.SWAP_SCREENS)),
    BUTTON_QUICK_SAVE(listOf(Input.QUICK_SAVE)),
    BUTTON_QUICK_LOAD(listOf(Input.QUICK_LOAD)),
    BUTTON_REWIND(listOf(Input.REWIND)),
    BUTTON_MICROPHONE_TOGGLE(listOf(Input.MICROPHONE)),

    // TAS Layout Components
    BUTTON_FRAME_ADVANCE(listOf(Input.FRAME_ADVANCE)),
    BUTTON_TAS_PAUSE(listOf(Input.TAS_PAUSE)),
    BUTTON_TAS_RESUME(listOf(Input.TAS_RESUME)),
    BUTTON_RECORD_INPUT(listOf(Input.RECORD_INPUT)),
    BUTTON_PLAYBACK_INPUT(listOf(Input.PLAYBACK_INPUT)),
    FRAME_COUNTER_DISPLAY(listOf(Input.FRAME_COUNTER)),

    // Save/Load Slot Layout Components
    BUTTON_SAVE_SLOT_1(listOf(Input.SAVE_SLOT_1)),
    BUTTON_SAVE_SLOT_2(listOf(Input.SAVE_SLOT_2)),
    BUTTON_SAVE_SLOT_3(listOf(Input.SAVE_SLOT_3)),
    BUTTON_SAVE_SLOT_4(listOf(Input.SAVE_SLOT_4)),
    BUTTON_SAVE_SLOT_5(listOf(Input.SAVE_SLOT_5)),
    BUTTON_SAVE_SLOT_6(listOf(Input.SAVE_SLOT_6)),
    BUTTON_SAVE_SLOT_7(listOf(Input.SAVE_SLOT_7)),
    BUTTON_SAVE_SLOT_8(listOf(Input.SAVE_SLOT_8)),
    BUTTON_SAVE_SLOT_9(listOf(Input.SAVE_SLOT_9)),
    BUTTON_LOAD_SLOT_1(listOf(Input.LOAD_SLOT_1)),
    BUTTON_LOAD_SLOT_2(listOf(Input.LOAD_SLOT_2)),
    BUTTON_LOAD_SLOT_3(listOf(Input.LOAD_SLOT_3)),
    BUTTON_LOAD_SLOT_4(listOf(Input.LOAD_SLOT_4)),
    BUTTON_LOAD_SLOT_5(listOf(Input.LOAD_SLOT_5)),
    BUTTON_LOAD_SLOT_6(listOf(Input.LOAD_SLOT_6)),
    BUTTON_LOAD_SLOT_7(listOf(Input.LOAD_SLOT_7)),
    BUTTON_LOAD_SLOT_8(listOf(Input.LOAD_SLOT_8)),
    BUTTON_LOAD_SLOT_9(listOf(Input.LOAD_SLOT_9));

    fun isScreen(): Boolean {
        return this == TOP_SCREEN || this == BOTTOM_SCREEN
    }
}