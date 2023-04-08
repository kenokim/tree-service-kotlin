import { createRouter, createWebHistory } from 'vue-router'
import TreeView from '../views/TreeView.vue'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/tree/:rootNodeId',
      name: 'tree',
      component: TreeView, props: true
    }
  ]
})

export default router
