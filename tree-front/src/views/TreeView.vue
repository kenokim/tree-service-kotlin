<template>
  <h2>Tree number # {{ rootNodeId }}</h2>
  <div v-for="nodeId in nodeIdList">

  </div>
  <div>
    {{ rootNode }}
  </div>
</template>

<script>
import axios from 'axios'

export default {
  props: {
    rootNodeId: null
  },
  data() {
    return {
      nodeIdList: [1, 2, 3, 4, 5],
      rootNode: null
    }
  },
  mounted() {
    
  }
}
</script>

<style>

</style>