@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION")

package kevlar

import kotlinx.JsExport

interface Action1Container<in I, out R> : Action1<I, R>, ActionContainer<(I) -> R>