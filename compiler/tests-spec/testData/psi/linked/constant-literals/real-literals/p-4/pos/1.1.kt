/*
 * KOTLIN PSI SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACE: constant-literals, real-literals -> paragraph 4 -> sentence 1
 * NUMBER: 1
 * DESCRIPTION: Real literals with underscores in a whole-number part and a fraction part.
 */

val value = 0.0_0
val value = 0.0__0___0
val value = 0.0_0__0_0

val value = 0__0.0
val value = 0_0_0.0______0
val value = 00_______________00.0_0_0

val value = 2_2.0_0
val value = 33__3.00__0
val value = 4_44____4.00______00
val value = 5_________555_________5.0
val value = 666_666.0_____________________________________________________________________________________________________________________0
val value = 7777777.0_0_0
val value = 8888888_8.0000
val value = 9_______9______9_____9____9___9__9_9.0

val value = 0_0_0_0_0_0_0_0_0_0.1234567890
val value = 1_2_3_4_5_6_7_8_9.2_3_4_5_6_7_8_9
val value = 234_5_678.345______________678
val value = 3_456_7.4567
val value = 456.5_6
val value = 5.6_5
val value = 6_54.7654
val value = 7_6543.87654_3
val value = 876543_____________2.9_____________8765432
val value = 9_____________87654321.098765432_____________1

val value = 000000000000000000000000000000000000000000000000000000000000000000000000000000000000000___0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000_0
val value = 0_000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.0___000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
val value = 9999999999999999999999999999999999999999999_______________999999999999999999999999999999999999999999999.33333333333333333333333333333333333333333333333_33333333333333333333333333333333333333333
