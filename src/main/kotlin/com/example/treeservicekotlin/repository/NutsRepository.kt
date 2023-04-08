package com.example.treeservicekotlin.repository

import com.example.treeservicekotlin.entity.Nuts
import org.springframework.data.jpa.repository.JpaRepository

interface NutsRepository: JpaRepository<Nuts, Long> {
}