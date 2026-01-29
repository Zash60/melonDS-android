package me.magnum.melonds.ui.emulator.input

import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.Point

abstract class FrontendInputHandler : IInputListener {
    override fun onKeyPress(key: Input) {
        when (key) {
            Input.PAUSE -> onPausePressed()
            Input.FAST_FORWARD -> onFastForwardPressed()
            Input.MICROPHONE -> onMicrophonePressed()
            Input.TOGGLE_SOFT_INPUT -> onSoftInputTogglePressed()
            Input.RESET -> onResetPressed()
            Input.SWAP_SCREENS -> onSwapScreens()
            Input.QUICK_SAVE -> onQuickSave()
            Input.QUICK_LOAD -> onQuickLoad()
            Input.REWIND -> onRewind()
            // TAS inputs
            Input.FRAME_ADVANCE -> onFrameAdvancePressed()
            Input.TAS_PAUSE -> onTASPausePressed()
            Input.TAS_RESUME -> onTASResumePressed()
            Input.RECORD_INPUT -> onRecordInputPressed()
            Input.PLAYBACK_INPUT -> onPlaybackInputPressed()
            Input.FRAME_COUNTER -> onFrameCounterPressed()
            // Save/Load slot inputs
            Input.SAVE_SLOT_1 -> onSaveSlotPressed(1)
            Input.SAVE_SLOT_2 -> onSaveSlotPressed(2)
            Input.SAVE_SLOT_3 -> onSaveSlotPressed(3)
            Input.SAVE_SLOT_4 -> onSaveSlotPressed(4)
            Input.SAVE_SLOT_5 -> onSaveSlotPressed(5)
            Input.SAVE_SLOT_6 -> onSaveSlotPressed(6)
            Input.SAVE_SLOT_7 -> onSaveSlotPressed(7)
            Input.SAVE_SLOT_8 -> onSaveSlotPressed(8)
            Input.SAVE_SLOT_9 -> onSaveSlotPressed(9)
            Input.LOAD_SLOT_1 -> onLoadSlotPressed(1)
            Input.LOAD_SLOT_2 -> onLoadSlotPressed(2)
            Input.LOAD_SLOT_3 -> onLoadSlotPressed(3)
            Input.LOAD_SLOT_4 -> onLoadSlotPressed(4)
            Input.LOAD_SLOT_5 -> onLoadSlotPressed(5)
            Input.LOAD_SLOT_6 -> onLoadSlotPressed(6)
            Input.LOAD_SLOT_7 -> onLoadSlotPressed(7)
            Input.LOAD_SLOT_8 -> onLoadSlotPressed(8)
            Input.LOAD_SLOT_9 -> onLoadSlotPressed(9)
            else -> {}
        }
    }

    override fun onKeyReleased(key: Input) {
    }

    override fun onTouch(point: Point) {
    }

    abstract fun onPausePressed()
    abstract fun onFastForwardPressed()
    abstract fun onMicrophonePressed()
    abstract fun onSoftInputTogglePressed()
    abstract fun onResetPressed()
    abstract fun onSwapScreens()
    abstract fun onQuickSave()
    abstract fun onQuickLoad()
    abstract fun onRewind()

    // TAS abstract methods
    abstract fun onFrameAdvancePressed()
    abstract fun onTASPausePressed()
    abstract fun onTASResumePressed()
    abstract fun onRecordInputPressed()
    abstract fun onPlaybackInputPressed()
    abstract fun onFrameCounterPressed()

    // Save/Load slot abstract methods
    abstract fun onSaveSlotPressed(slot: Int)
    abstract fun onLoadSlotPressed(slot: Int)
}