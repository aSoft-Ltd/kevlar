@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION")

package kevlar

import kotlin.js.JsExport

interface Action1Container<in I, out R> : Action1<I, R>, ActionContainer<(I) -> R>