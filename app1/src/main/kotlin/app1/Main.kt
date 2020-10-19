@file:JvmName("Main")
package app1

import com.google.common.base.Strings
import shared.DeepThought

fun main() {
    println(Strings.repeat("1", 42))

    val answer = DeepThought.compute()
    println("[App1] The answer to the ultimate question of Life, the Universe and Everything is $answer.")
}
