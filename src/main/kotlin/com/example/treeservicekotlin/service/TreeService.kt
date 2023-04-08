package com.example.treeservicekotlin.service

import com.example.treeservicekotlin.dto.NodeDto
import com.example.treeservicekotlin.entity.Node
import com.example.treeservicekotlin.repository.NodeRepository
import com.example.treeservicekotlin.repository.NutsRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class TreeService(
    private val nodeRepository: NodeRepository,
    private val nutsRepository: NutsRepository
) {
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

    @Transactional
    fun generateRoot(name: String): Node =
        nodeRepository.save(Node(nodeId = null, name = name, parent = null))

    fun getNode(nodeId: Long, expand: Boolean = false): NodeDto {
        val node = nodeRepository.findById(nodeId)
        if (expand) {
            return NodeDto.fromEntityExpand(node.orElseThrow())
        }

        return NodeDto.fromEntity(node.orElseThrow())
    }
}