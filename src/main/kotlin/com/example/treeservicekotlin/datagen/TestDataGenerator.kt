package com.example.treeservicekotlin.datagen

import com.example.treeservicekotlin.entity.Node
import com.example.treeservicekotlin.repository.NodeRepository
import com.example.treeservicekotlin.service.TreeService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import kotlin.random.Random.Default.nextInt

@Component
class TestDataGenerator(
    private val nodeRepository: NodeRepository,
    private val treeService: TreeService): CommandLineRunner
{
    override fun run(vararg args: String?) {
        generateRandomTree()
    }

    private fun generateSampleTree() {
        val root = treeService.generateRoot("Root")

        val node_1_1 = Node(nodeId = null, "Node_1_1", root)
        nodeRepository.save(node_1_1)

        val node_1_2 = Node(nodeId = null, "Node_1_2", root)
        nodeRepository.save(node_1_2)

        val node_2_1 = Node(name = "Node_2_1", parent = node_1_1)
        nodeRepository.save(node_2_1)
    }

    private fun generateRandomTree() {
        val root = treeService.generateRoot("Root")
        val depth = 0

        val N = nextInt(0, 3)
        generateNodes(root, depth, N)
    }

    val depthLimit = 3

    private fun generateNodes(node: Node, depth: Int, N: Int) {
        if (depth > depthLimit) {
            return
        }

        for (i in 0..N) {
            val child = generateNode(node)
            val nextN = nextInt(0, 7)

            generateNodes(child, depth + 1, nextN)
        }
    }

    private fun generateNode(node: Node): Node {
        val name = "node" + nextInt(0, 1000)
        val child = Node(name = name, parent = node)
        nodeRepository.save(child)
        return child
    }
}