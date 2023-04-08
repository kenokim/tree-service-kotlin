package com.example.treeservicekotlin.dto

import com.example.treeservicekotlin.entity.Node
import com.example.treeservicekotlin.entity.Nuts

data class NodeDto(
    var nodeId: Long?,
    var name: String,
    var children: ArrayList<NodeDto> = ArrayList(),
    var nuts: List<Nuts> = ArrayList()
) {
    override fun toString(): String {
        return "$nodeId $name $nuts \n $children"
    }

    companion object {
        fun fromEntity(node: Node): NodeDto {
            return NodeDto(node.nodeId, node.name)
        }

        fun fromEntityExpand(node: Node): NodeDto {
            var list = ArrayList<NodeDto>()
            for (child in node.children) {
                list.add(fromEntityExpand(child))
            }

            return NodeDto(node.nodeId, node.name, list)
        }
    }
}