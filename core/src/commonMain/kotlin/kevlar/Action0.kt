@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION")

package kevlar

import kotlin.js.JsExport

interface Action0<out R> : Action<() -> R> {
    operator fun invoke(): R
}