package com.example.treeservicekotlin.repository

import com.example.treeservicekotlin.entity.Node
import org.springframework.data.jpa.repository.JpaRepository

interface NodeRepository: JpaRepository<Node, Long> {
}