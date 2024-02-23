import axios from 'axios'

// const username = 'username'
// const password = 'd6003d9f-4797-4f31-8e97-cf78558fe8cf'

// const encodedCredentials = btoa(`${username}:${password}`)

export const service = axios.create({
  baseURL: 'http://localhost:8080/',
  timeout: 5000,
  headers: {
    // Authorization: `Basic ${encodedCredentials}`,
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*',
    'Access-Control-Allow-Methods': 'GET,PUT,POST,DELETE,PATCH,OPTIONS',
    'Access-Control-Allow-Headers': '*'
  }
  // withCredentials: true
})
