package com.example.treeservicekotlin.service

import com.example.treeservicekotlin.dto.NodeDto
import org.springframework.stereotype.Service

@Service
class TreeService {
    fun getMockNode(): NodeDto {
        var node = NodeDto(1L, "Top Level Node 1")
        var child1 = NodeDto(2L, "Second Level Node 1")
        var child2 = NodeDto(3L, "Second Level Node 2")
        var grandChild1 = NodeDto(4L, "Third Level Node 1")

        child1.children.add(grandChild1)

        node.children.add(child1)
        node.children.add(child2)
        return node
    }
}