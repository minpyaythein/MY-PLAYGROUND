import { service } from './service.js'

export default {
  getMembers() {
    return service.get('/getMembers')
  }
}
