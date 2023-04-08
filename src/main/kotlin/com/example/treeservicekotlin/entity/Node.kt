package com.example.treeservicekotlin.entity

import jakarta.persistence.*

@Entity
class Node(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val nodeId: Long,

    val name: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "node_id")
    val parent: Node,

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    val children: List<Node> = ArrayList(),

    @OneToMany(mappedBy = "node", fetch = FetchType.LAZY)
    val nutsList: List<Nuts> = ArrayList()
) {

}