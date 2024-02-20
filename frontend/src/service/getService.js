import { service } from './service.js'

export const getMembers = () => {
  return service.get('/getMembers')
}
