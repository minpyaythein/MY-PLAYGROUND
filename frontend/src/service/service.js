import axios from 'axios'

export const service = axios.create({
  baseURL: 'http://localhost:8080/',
  timeout: 5000,
  headers: {
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*',
    'Access-Control-Allow-Methods': 'GET,PUT,POST,DELETE,PATCH,OPTIONS',
    'Access-Control-Allow-Headers': '*'
  },
  withCredentials: true
})
