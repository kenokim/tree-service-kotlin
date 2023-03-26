package com.example.treeservicekotlin.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class Edge(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val edgeId: Long,

    @ManyToOne
    @JoinColumn(name = "parent_id")
    val parent: Node,

    @ManyToOne
    @JoinColumn(name = "child_id")
    val child: Node
) {
}