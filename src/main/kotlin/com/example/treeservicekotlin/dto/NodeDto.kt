package com.example.treeservicekotlin.dto

import com.example.treeservicekotlin.entity.Nuts

data class NodeDto(
    var nodeId: Long,
    var name: String,
    var children: ArrayList<NodeDto> = ArrayList(),
    var nuts: List<Nuts> = ArrayList()
)