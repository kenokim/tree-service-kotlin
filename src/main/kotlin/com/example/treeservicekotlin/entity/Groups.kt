package com.example.treeservicekotlin.entity

import jakarta.persistence.*

@Entity
class Groups(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val groupsId: Long
) {
}