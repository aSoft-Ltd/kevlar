@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION")

package actions

import kotlin.js.JsExport

@Deprecated("use kevlar instead")
interface Action1<in I, out R> : Action<(I) -> R> {
    operator fun invoke(arg: I): R
}