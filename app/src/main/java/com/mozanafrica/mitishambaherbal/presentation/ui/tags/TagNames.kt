package com.mozanafrica.mitishambaherbal.presentation.ui.tags

enum class TagNames(val value: String) {
    HEAD("head"),
    HANDS("hands"),
    LEGS("legs"),
    KIDNEY("kidney"),
    STOMACH("stomach"),
    EARS("ears"),
    TEETH("teeth"),
}

fun getAllTags(): List<TagNames> {
    return listOf(
        TagNames.HEAD,
        TagNames.HANDS,
        TagNames.LEGS,
        TagNames.KIDNEY,
        TagNames.STOMACH,
        TagNames.EARS,
        TagNames.TEETH
    )
}
fun getTag(value:String): TagNames? {
    val map=TagNames.values().associateBy (TagNames::value)
    return map[value]
}