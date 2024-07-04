package com.spring_boot.lab.team

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
open class Team(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String,
    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "updated_at")
    val updatedAt: LocalDateTime? = null,
) {

}
