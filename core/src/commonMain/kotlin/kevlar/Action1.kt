@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION")

package kevlar

import kotlin.js.JsExport

interface Action1<in I, out R> : Action<(I) -> R>