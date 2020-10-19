@file:JvmName("Main")
package app2

import com.google.common.base.Strings
import shared.DeepThought

fun main() {
    println(Strings.repeat("2", 42))

    val answer = DeepThought.compute()
    println("[App2] The answer to the ultimate question of Life, the Universe and Everything is $answer.")
}
