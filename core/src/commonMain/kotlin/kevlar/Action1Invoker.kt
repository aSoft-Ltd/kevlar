@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION")

package kevlar

import kotlinx.JsExport

interface Action1Invoker<in I, out R> : Action1<I, R>, ActionInvoker<suspend (I) -> R> {
    suspend operator fun invoke(arg: I): R
}