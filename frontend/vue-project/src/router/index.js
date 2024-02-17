import { createRouter, createWebHistory } from 'vue-router'
import MyPlayground from '../views/MyPlayground.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'MyPlayground',
      component: MyPlayground
    }
  ]
})

export default router
