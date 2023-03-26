package com.example.treeservicekotlin.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Node(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val nodeId: Long,
    val name: String
) {
}