package br.com.drianodev.avengersapi.application.web.resource.response

import br.com.drianodev.avengersapi.domain.Avenger

data class AvengerResponse(
    val id: Long?,
    val nick: String,
    val person: String,
    val description: String?,
    val history: String?
) {
    companion object {
        fun from(avenger: Avenger) = AvengerResponse(
            id = avenger.id,
            nick = avenger.nick,
            person = avenger.person,
            description = avenger.description,
            history = avenger.history
        )
    }
}