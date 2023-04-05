package com.example.treeservicekotlin.controller

import com.example.treeservicekotlin.dto.NodeDto
import com.example.treeservicekotlin.service.TreeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TreeController(
    private val treeService: TreeService
) {
    @GetMapping("/node/{nodeId}")
    fun getNode(@PathVariable nodeId: String): NodeDto = treeService.getMockNode()
}