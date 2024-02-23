<template>
  <button class="btn btn-outline-secondary" @click="getMembers()">hello</button>
</template>

<script setup>
import getService from '../service/getService.js'

const getMembers = async () => {
  console.log('hello')
  const response = await getService.getMembers()
  console.log(response.data)
}
</script>

<style scoped></style>
