<template>
<div id="treeNode" class="tree-node p-1">
Hello world
</div>    
</template>

<script>

export default {
  name: 'TreeNode',

  props: {
    treeNode: null
  },

  data() {
    return {
      isOpen: false,
      children: []
    }
  }
}

</script>