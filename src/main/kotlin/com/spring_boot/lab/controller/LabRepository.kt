package com.spring_boot.lab.controller

import org.springframework.data.jpa.repository.JpaRepository

interface LabRepository: JpaRepository<User, Long> {

}
