package com.example.treeservicekotlin.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class GroupNode(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val groupNodeId: Long,

    @ManyToOne
    @JoinColumn(name = "groups_id")
    val groups: Groups,

    @ManyToOne
    @JoinColumn(name = "node_id")
    val node: Node
) {
}