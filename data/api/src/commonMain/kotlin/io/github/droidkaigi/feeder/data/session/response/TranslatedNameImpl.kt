package io.github.droidkaigi.feeder.data.session.response

import kotlinx.serialization.Serializable

@Serializable
internal data class TranslatedName(
    val ja: String,
    val en: String
)
