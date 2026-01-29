package me.magnum.melonds.domain.model

/**
 * Input representation that is assigned to the given key code. If the input does not represent a
 * system input (i.e., it represents additional functionality offered by the emulator), a key code
 * of -1 must be used.
 *
 * @param keyCode The key code that the input represents in the system or -1 if it is not assigned
 * to any system input
 */
enum class Input(val keyCode: Int) {
    A(0),
    B(1),
    SELECT(2),
    START(3),
    RIGHT(4),
    LEFT(5),
    UP(6),
    DOWN(7),
    R(8),
    L(9),
    X(10),
    Y(11),
    DEBUG(16 + 3),
    TOUCHSCREEN(16 + 6),
    HINGE(16 + 7),
    PAUSE(-1),
    FAST_FORWARD(-1),
    MICROPHONE(-1),
    RESET(-1),
    TOGGLE_SOFT_INPUT(-1),
    SWAP_SCREENS(-1),
    QUICK_SAVE(-1),
    QUICK_LOAD(-1),
    REWIND(-1),

    // TAS inputs
    FRAME_ADVANCE(-1),
    TAS_PAUSE(-1),
    TAS_RESUME(-1),
    RECORD_INPUT(-1),
    PLAYBACK_INPUT(-1),
    FRAME_COUNTER(-1),

    // Save/Load slot inputs
    SAVE_SLOT_1(-1),
    SAVE_SLOT_2(-1),
    SAVE_SLOT_3(-1),
    SAVE_SLOT_4(-1),
    SAVE_SLOT_5(-1),
    SAVE_SLOT_6(-1),
    SAVE_SLOT_7(-1),
    SAVE_SLOT_8(-1),
    SAVE_SLOT_9(-1),
    LOAD_SLOT_1(-1),
    LOAD_SLOT_2(-1),
    LOAD_SLOT_3(-1),
    LOAD_SLOT_4(-1),
    LOAD_SLOT_5(-1),
    LOAD_SLOT_6(-1),
    LOAD_SLOT_7(-1),
    LOAD_SLOT_8(-1),
    LOAD_SLOT_9(-1);

    val isSystemInput: Boolean
        get() = keyCode != -1

    val isSaveSlot: Boolean
        get() = this in listOf(SAVE_SLOT_1, SAVE_SLOT_2, SAVE_SLOT_3, SAVE_SLOT_4, SAVE_SLOT_5, SAVE_SLOT_6, SAVE_SLOT_7, SAVE_SLOT_8, SAVE_SLOT_9)

    val isLoadSlot: Boolean
        get() = this in listOf(LOAD_SLOT_1, LOAD_SLOT_2, LOAD_SLOT_3, LOAD_SLOT_4, LOAD_SLOT_5, LOAD_SLOT_6, LOAD_SLOT_7, LOAD_SLOT_8, LOAD_SLOT_9)

    val saveSlotNumber: Int?
        get() = when (this) {
            SAVE_SLOT_1 -> 1
            SAVE_SLOT_2 -> 2
            SAVE_SLOT_3 -> 3
            SAVE_SLOT_4 -> 4
            SAVE_SLOT_5 -> 5
            SAVE_SLOT_6 -> 6
            SAVE_SLOT_7 -> 7
            SAVE_SLOT_8 -> 8
            SAVE_SLOT_9 -> 9
            else -> null
        }

    val loadSlotNumber: Int?
        get() = when (this) {
            LOAD_SLOT_1 -> 1
            LOAD_SLOT_2 -> 2
            LOAD_SLOT_3 -> 3
            LOAD_SLOT_4 -> 4
            LOAD_SLOT_5 -> 5
            LOAD_SLOT_6 -> 6
            LOAD_SLOT_7 -> 7
            LOAD_SLOT_8 -> 8
            LOAD_SLOT_9 -> 9
            else -> null
        }

    companion object {
        val SYSTEM_BUTTONS = listOf(A, B, X, Y, L, R, START, SELECT, LEFT, RIGHT, UP, DOWN)

        // TAS inputs
        val TAS_INPUTS = listOf(FRAME_ADVANCE, TAS_PAUSE, TAS_RESUME, RECORD_INPUT, PLAYBACK_INPUT, FRAME_COUNTER)

        // Save slot inputs
        val SAVE_SLOT_INPUTS = listOf(SAVE_SLOT_1, SAVE_SLOT_2, SAVE_SLOT_3, SAVE_SLOT_4, SAVE_SLOT_5, SAVE_SLOT_6, SAVE_SLOT_7, SAVE_SLOT_8, SAVE_SLOT_9)

        // Load slot inputs
        val LOAD_SLOT_INPUTS = listOf(LOAD_SLOT_1, LOAD_SLOT_2, LOAD_SLOT_3, LOAD_SLOT_4, LOAD_SLOT_5, LOAD_SLOT_6, LOAD_SLOT_7, LOAD_SLOT_8, LOAD_SLOT_9)

        // All save/load slot inputs
        val ALL_SLOT_INPUTS = SAVE_SLOT_INPUTS + LOAD_SLOT_INPUTS
    }
}