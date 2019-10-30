package com.chsltutorials.monitoramentometrolondres.model.entity

import com.google.gson.annotations.SerializedName

data class LineStatus(
    val id: String,

    val name: String,

    val severityLevel: String,

    val severityLevelDescription: String
)


data class LineStatusModel (

    val id: String,

    val name: String,

    val statusModel : List<StatusModel>

)



data class StatusModel(

    @SerializedName("statusSeverity")
    val severityLevel: String,

    @SerializedName("statusSeverityDescription")
    val severityLevelDescription: String
)

