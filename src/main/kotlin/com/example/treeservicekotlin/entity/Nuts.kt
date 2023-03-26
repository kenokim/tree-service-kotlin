package com.example.treeservicekotlin.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class Nuts(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val nutsId: Long,

    @ManyToOne
    @JoinColumn(name = "node_id")
    val node: Node
) {
}