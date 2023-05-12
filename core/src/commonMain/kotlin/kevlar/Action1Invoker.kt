@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION")

package kevlar

import kotlin.js.JsExport

interface Action1Invoker<in I, out R> : Action1<I, R>, ActionInvoker<(I) -> R> {
    operator fun invoke(arg: I): R
}