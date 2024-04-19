package br.com.drianodev.avengersapi.domain

data class Avenger(
    val id: Long? = null,
    val nick: String,
    val person: String,
    val description: String?,
    val history: String?
)