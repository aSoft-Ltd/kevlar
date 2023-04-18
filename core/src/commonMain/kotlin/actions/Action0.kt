@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION")

package actions

import kotlin.js.JsExport

@Deprecated("use kevlar instead")
interface Action0<out R> : Action<() -> R> {
    operator fun invoke(): R
}