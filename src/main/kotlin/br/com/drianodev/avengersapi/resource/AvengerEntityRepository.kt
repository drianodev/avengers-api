package br.com.drianodev.avengersapi.resource

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AvengerEntityRepository : JpaRepository<AvengerEntity, Long>